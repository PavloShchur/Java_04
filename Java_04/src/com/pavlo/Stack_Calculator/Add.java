package com.pavlo.Stack_Calculator;

import java.util.Map;
import java.util.Stack;


public class Add implements Cmd {
	
	
	@Override
	public void exec(String[] parts, Stack<Double> stack) {
		stack.push(stack.pop() + stack.pop());
		
	}

	

	@Override
	public void exec(String[] parts, Stack<Double> stack, Map<String, Double> defines) {
		stack.push(stack.pop() + stack.pop());
		
	}


	@Override
	public void exec(Stack_Calculator_1 stack_Calculator_1) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void exec() {
		// TODO Auto-generated method stub
		
	}}
