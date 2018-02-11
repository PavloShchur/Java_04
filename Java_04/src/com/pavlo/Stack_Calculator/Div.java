package com.pavlo.Stack_Calculator;

import java.util.Map;
import java.util.Stack;

public class Div implements Cmd {

	@Override
	public void exec(String[] parts, Stack<Double> stack, Map<String, Double> defines) {
		double e = stack.lastElement();
		try {
			stack.push(stack.pop() / Double.valueOf(parts[1]));
		} finally {
			stack.removeElement(stack.size() - 1);
			stack.push(e);
			System.out.println("Cannot divide into null!");
		}
	}

	

	@Override
	public void exec(Stack_Calculator_1 stack_Calculator_1) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exec(String[] parts, Stack<Double> stack) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exec() {
		// TODO Auto-generated method stub
		
	}

}
