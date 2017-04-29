package n_i_o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ShowFile {

	public static void main(String[] args) throws IOException {
		int i;

		if (args.length != 1) {
			System.out.println("Застосування: ShowFile імя файлу.");
			return;
		}
		try (InputStream fin = Files.newInputStream(Paths.get(args[0]))) {
			do {
				i = fin.read();
				if (i != -1)
					System.out.println((char) i);
			} while (i != -1);
		} catch (InvalidPathException e) {
			System.out.println("Помилка вказування шляху: " + e);
		} catch (IOException e) {
			System.out.println("Помилка вводу-виводу " + e);
		}
	}

}
