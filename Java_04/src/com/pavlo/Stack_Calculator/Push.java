package com.pavlo.Stack_Calculator;

import java.util.Map;
import java.util.Stack;

public class Push implements Cmd {

	public void exec(String parts[], Stack<Double> stack, Map<String, Double> defines) {
		if(Difine.contains.containsKey(parts[1])) {
			stack.push(Difine.contains.get(parts[1]));
		} else {
		stack.push(Double.valueOf(parts[1]));
		}
	}

	@Override
	public void exec(String[] parts, Stack<Double> stack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exec(Stack_Calculator_1 stack_Calculator_1) {
	
	}

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		
	}		
	}
	

