package com.pavlo.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serial"))) {
			 MyClass object1 = new MyClass("Hello", -7, 2.7e10);
			 System.out.println("object1: " + object1);
			 objectOutputStream.writeObject(object1);
		} catch (IOException e) {
			System.out.println("Виняток при серіалізації: " + e);
		}
		
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("serial"))) {
			MyClass object2 = (MyClass)inputStream.readObject();
			System.out.println("object2: " + object2);
		} catch (Exception e) {
			System.out.println("Виняток при десеріалізації: " + e);
			System.exit(0);
		}
	}

}

class MyClass implements Serializable {
	String s;
	int i; double d;
	
	public MyClass (String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
	}
	public String toString() {
		return "s=" + s + "; i=" + i + "; d=" + d;
	}
}

