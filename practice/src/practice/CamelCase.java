package practice;
import java.util.function.Function;

public class CamelCase {
    public static void main(String[] args) {
        String st = "hello world example";
        String newcc="";
       
        String [] camelcase=st.split(" ");
        for(String word : camelcase) {
        	String appendn="";
        for(int i=0;i<word.length();i++) {
        	 
        	if(i==0) {
        		
        		appendn+=(word.charAt(i)+"" ).toUpperCase();
        		
        	}
        	
        	else {
        		appendn+=(word.charAt(i)+"" ).toLowerCase();
        	}
        }
        	newcc+=appendn+" ";
        	
        	}
        
        System.out.println(newcc);
        }
        	
    }

