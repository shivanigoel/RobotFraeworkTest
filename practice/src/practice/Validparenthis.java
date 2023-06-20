package practice;

import java.util.Stack;

public class Validparenthis {
	
	public static void main(String[] args) {
		
		String s="{([])}}";
		Stack<Character> stk=new Stack<Character>();
		
	
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {  
				
				stk.push(s.charAt(i));
				
		}
			
			else if (s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')') {
				
				if(stk.isEmpty() || !ismacting(stk.pop(),s.charAt(i))){
					
					System.out.println("invalid");
					return;
				}
			}
			
			
	}
		
		if(stk.isEmpty()) {
			
			System.out.println("valid");
		}
		
		else {
			
			System.out.println("invalid");
		}

}

	public static boolean ismacting(Character c, char c1) {
		
			return (c=='{' && c1=='}') || (c=='(' && c1==')') || (c=='[' && c1==']');
			
		}
}