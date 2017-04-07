package My_file_finder;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {

	static int compareFiles(File f1, File f2) throws FileNotFoundException, IOException {
		try (BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream(f1));
				BufferedInputStream fis2 = new BufferedInputStream(new FileInputStream(f2));) {

			while (true) {
				int b1 = fis1.read();
				int b2 = fis2.read();
				if (b1 == -1 && b2 == -1) {
					return 0;
				}
				if (b1 != b2)
					return b1 - b2;

			}
		}
	}

	public static List<File> getAllFile(File f) {
		ArrayList<File> files = new ArrayList<File>();
		File[] folders = f.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {

				return pathname.isDirectory();
			}
		});
		for (File folder : folders) {

			files.addAll(getAllFile(folder));
		}
		File[] files1 = f.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.isFile();
			}
		});
		files.addAll(Arrays.asList(files1));

		return files;

	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<File> files = getAllFile(new File("D:\\GitHub\\Commit_14\\Java_04"));
		TreeSet<File> ts = new TreeSet<File>(new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
					try {
						return compareFiles(o1, o2);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
					return 0;
				
			
			}
		});
		try {
		for (File f : files) {
			if(!ts.contains(f)) {
				ts.add(f);
			} else {
				File old = ts.floor(f);
				System.out.println("Файл " + f + " такий же як " + old);
			}}
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
	// for (int i = 0; i < files.size(); i++) {
	// for (int j = i + 1; j < files.size(); j++) {
	// if (compareFiles(files.get(i), files.get(j)) == 0) {
	// System.out.println("Файли " + files.get(i) + " та " + files.get(j) + "
	// рівні.");
	// }
	// }
	// }
	// int q = compare(new File("./a.txt"), new File("./b.txt"));
	// System.out.println(q);
}
