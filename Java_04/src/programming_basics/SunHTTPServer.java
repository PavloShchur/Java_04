package programming_basics;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;
import static com.sun.net.httpserver.spi.HttpServerProvider.provider;

public class SunHTTPServer {

	public static void main(String[] args) throws IOException {
		HttpServer server = provider().createHttpServer(new InetSocketAddress(80), 256);
		server.createContext("/fs/", new FileSystemHandler());
		

	}

}
