package practice;

import java.util.HashSet;

public class uniquechar {
	

	public static void main(String[] args) {
		
		int maxlength=0;
		HashSet<Character> HS=new HashSet<Character>();
		String s="abcabcbb";
		for(int i=0;i<s.length();i++) {
			
			int j=i;
			
			while(j<s.length() && !HS.contains(s.charAt(j))) {
				
				HS.add(s.charAt(j));
				j++;
				
				
			}
			
			maxlength=Math.max(maxlength, HS.size());
			
		
		}
		
		System.out.println(maxlength);
		System.out.println(HS.toString());
		
	} 

}
