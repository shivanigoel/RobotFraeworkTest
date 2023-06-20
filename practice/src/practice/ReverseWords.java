package practice;

public class ReverseWords {
   public static void main(String[] args) {
	
	   String s="Hello World! This is a test.";
	   String [] sp=s.split(" ");
	   
	   for(int i=sp.length-1;i>=0;i--) {
		   
		   String st=sp[i]+" "; 
		   System.out.print(st);
	   }
}
}