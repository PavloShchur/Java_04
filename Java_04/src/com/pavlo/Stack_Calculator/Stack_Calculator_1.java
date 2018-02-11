package com.pavlo.Stack_Calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Calculator_1 {
	Map<String, Double> contains = new  HashMap<String, Double>();
	static Stack<Double> stack = new Stack<Double>();
	Map<String, Cmd> commandMap = new HashMap<String, Cmd>();
	public Stack_Calculator_1() {
		this.commandMap.put("PUSH", new Push());
		this.commandMap.put("PRINT", new Print());
		this.commandMap.put("ADD", new Add());
		this.commandMap.put("DIV", new Div());
		this.commandMap.put("POP", new Pop());
		this.commandMap.put("SUB", new Sub());
		this.commandMap.put("DEFINE", new Difine());
		}
	
//	public void setCommandMap(Map<String, Cmd> CommandMap) {
//		this.commandMap = CommandMap;
//	}
	public static void main(String[] args) {
		Stack_Calculator_1 stack_Calculator_1 = new Stack_Calculator_1();
		Scanner s = new Scanner(System.in);
		
		
		
		
		while (true) {
			String line = s.nextLine();
			String[] parts = line.toUpperCase().split(" ");
			
			stack_Calculator_1.commandMap.get(parts[0]).exec(stack_Calculator_1);	
		}
	}
}
