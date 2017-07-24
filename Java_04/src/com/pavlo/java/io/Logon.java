package com.pavlo.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

public class Logon implements Serializable {

	private Date date = new Date();
	private String username;
	private transient String password;

	public Logon(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Logon [date=" + date + ", username=" + username + "]";
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Logon logon = new Logon("User", "Password");
		System.out.println("Seanse " + logon);
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Logon.out"));
		o.writeObject(logon);
		o.close();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.out"));
		System.out.println(new Date());
		try {
			logon = (Logon) in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Seanse logon = " + logon);

	}

}
