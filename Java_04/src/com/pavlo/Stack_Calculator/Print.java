package com.pavlo.Stack_Calculator;

import java.util.Map;
import java.util.Stack;

public class Print implements Cmd {

	public void exec(String parts[], Stack<Double> stack, Map<String, Double> defines) {
		System.out.println(stack);
	}

	@Override
	public void exec(String[] parts, Stack<Double> stack) {
		System.out.println(stack);
		
	}

	@Override
	public void exec(Stack_Calculator_1 stack_Calculator_1) {
		
	}

	@Override
	public void exec() {
		
	}
	
}
