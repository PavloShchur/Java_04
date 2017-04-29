package n_i_o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExcplictChannelWrite {

	public static void main(String[] args) throws IOException {
		try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("text.txt"), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
			ByteBuffer mBuf = ByteBuffer.allocate(26);
			for (byte i = 0; i < 26; i++)
				mBuf.put((byte) ('A' + i));
			mBuf.rewind();
			
			fChan.write(mBuf);
		} catch (InvalidPathException e) {
			System.out.println("Помилка вказування шляху " + e);
		} catch (IOException e) {
			System.out.println("Помилка вводу-виводу: " + e);
			System.exit(1);
		}
	}

}
