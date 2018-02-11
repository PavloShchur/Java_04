package com.pavlo.Stack_Calculator;

import java.util.Map;
import java.util.Stack;

public interface Cmd {
	public void exec(Stack_Calculator_1 stack_Calculator_1);

	void exec(String[] parts, Stack<Double> stack, Map<String, Double> defines);

	void exec(String[] parts, Stack<Double> stack);

	void exec();


}
