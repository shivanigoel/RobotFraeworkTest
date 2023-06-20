package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PracticeAll {
    public static void main(String[] args) {
       
    	String input = "india is great";
    	String [] input1=input.split(" ");
    	
    	for(int i=0;i<input1.length;i++) {
    		
    		for(int j=input1[i].length()-1;j>=0;j--) {
    		
    		System.out.print(input1[i].charAt(j) );
    		}
    		
    		System.out.print(" ");
    	}
    	
    }
}
