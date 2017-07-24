package com.pavlo.java.io;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;;


public class Hypot {

	public static void main(String[] args) {
		double side1, side2;
		double hypot;
		side1 = 3.0;
		side2 = 4.0;

		hypot = sqrt(pow(side1, side2) + pow(side2, side1));
		out.println("При заданій довжині сторін " + side1 + " і " + side2 + " гіпотенуза рівна " + hypot);
	}

}