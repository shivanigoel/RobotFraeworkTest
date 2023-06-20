package practice;

import java.util.HashMap;

public class hashmao {
	
	public static void main(String[] args) {
		
		String str = "This this is is done by Saket Saket";
		String [] str1=str.split(" "); 
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(String str2:str1) {
			
			if(map.containsKey(str2)) {
				
				map.put(str2,map.get(str2)+1);
			}
			
			else {
				
				map.put(str2,1);
			}
			
		}
		
		System.out.println(map);
		
	}

}
