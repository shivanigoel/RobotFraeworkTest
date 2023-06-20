package practice;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
		String s="Listen";
		String b="siLent";
		
		if(s.length() == b.length()) {
			
			System.out.println("Lenght is equal for both the strings");
			char[] s1=s.toCharArray();
			char[] b1=b.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(b1);
			boolean status =Arrays.equals(s1, b1);
			
			System.out.println(status);
			
			if(Arrays.equals(s1, b1)) {
				
				System.out.println("both string are anagram");
			}
		}
		
		}
}
