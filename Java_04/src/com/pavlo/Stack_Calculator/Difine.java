package com.pavlo.Stack_Calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Difine implements Cmd {
	public static Map<String, Double> contains = new  HashMap<String, Double>();

	@Override
	public void exec(String[] parts, Stack<Double> stack, Map<String, Double> defines) {
		contains.put((String) parts[1], Double.valueOf(parts[2]));
	}

	@Override
	public void exec(String[] parts, Stack<Double> stack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exec(Stack_Calculator_1 stack_Calculator_1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		
	}

}
