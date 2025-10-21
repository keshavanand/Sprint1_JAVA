package com.fdmgroup.problemSolvingExercises.Intermediate;

import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		
		String[] tests = {"()","()[]{}","(]","([])","([)]","[","[[","]"};
		
		for(String test:tests) {
			System.out.println("Test "+test+" : "+isBalancedParentheses(test));
		}

	}
	
	public static boolean isBalancedParentheses(String parentheses) {
		
		Stack<Character> stack = new Stack<>();

        for(char value: parentheses.toCharArray()){
            
        	if(value == '(' || value == '[' || value =='{'){
                stack.push(value);
            }else {
            	if (stack.isEmpty()) return false;
            	
            	char lastParantheses = stack.pop();
                
                if(lastParantheses == '(' && ')' !=value)
                	return false;

                if(lastParantheses == '{' && '}' !=value)
                	return false;

                if(lastParantheses == '[' && ']' !=value)
                	return false;
                
            }
            

        }
        return stack.isEmpty();
	}
}
