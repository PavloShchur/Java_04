package n_i_o;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOCopy {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("застосування: звідки  і куди копіювати");
			return;
		}
		try {
			Path source = Paths.get(args[0]);
			Path target = Paths.get(args[1]);
			Files.copy(source, target);
		} catch (InvalidPathException e) {
			System.out.println("Помилка вказування шляху " + e);
		} catch (IOException e) {
			System.out.println("Помилка вводу-виводу " + e);
		}
	}

}
