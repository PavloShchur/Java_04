package programming_basics;

import java.io.File;
import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class FileSystemHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange exchange) throws IOException {
//			String requestURI = exchange.getRequestURI().toString().replaceAll("20", " ");
//			File file = new File("d:" + requestURI.substring(3));
//			byte[] data;
//			String contentType;
//			if(file.isDirectory()) {
//				data = renderFolder(file);
//				contentType = HTML;
//			} else {
//				data = renderPage(file);
//				contentType = calcRespType(file.toString());
//	
//			}
//			
//			exchange.sendResponseHeaders(200, data.length);
//			exchange.getResponseHeaders().put("Content-Type", asL);
			
	}

}
