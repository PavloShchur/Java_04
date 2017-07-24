package com.pavlo.java.io;

import java.io.File;

public class DirList {

	public static void main(String[] args) {
		String dirname = "/java";
		File fl = new File(dirname);
		if (fl.isDirectory()) {
			System.out.println("Catalog: " + dirname);
			String s[] = fl.list();
			
			for (int i = 0; i < s.length; i++) {
				File f = new File(dirname + "/" + s[i]);
				if (f.isDirectory()) {
					System.out.println(s[i] + " is a catalog.");
				} else {
					System.out.println(s[i] + " is a file");
				}
			}
		} else {
			System.out.println(dirname + " is not a catalog.");
		}
	}

}
