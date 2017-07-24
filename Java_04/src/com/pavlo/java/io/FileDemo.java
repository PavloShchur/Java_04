package com.pavlo.java.io;

import java.io.File;

public class FileDemo {
		
	static void p (String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		File f1 = new File("/java/COPYROGHT");
		p("The name of file: " + f1.getName());
		p("Absoluty path: " + f1.getAbsolutePath());
		p("Parent: " + f1.getParent());
		p(f1.exists() ? "exists" : "not exists");
		p(f1.canWrite() ? "available for writing" : "not avilable for writing");
		p(f1.canWrite() ? "available for reading" : "not avilable for reading");
		p(f1.isDirectory() ? "is catalog" : "not catalog");
		p(f1.isFile() ? "simple file" : "not simple file");
		p(f1.isAbsolute() ? "absolute" : "notv absolute");
		p("The last changes in file: " + f1.lastModified());
		p("Size: " + f1.length() + " bytes.");
	}

}
