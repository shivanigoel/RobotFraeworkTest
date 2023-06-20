package practice;

public class reversewordwithoutchangnpos {

	public static void main(String[] args) {
		
	
	
	String s="Hello World! This is a test.";
	   String [] sp=s.split(" ");
	   
	   String newst="";
	   String finals="";
	   for(int i=0;i<sp.length;i++) {
		   
		  int len=sp[i].length();
		   
		   for(int j=len-1;j>=0;j--) {
			   
			   System.out.println("--------------");
			    newst=newst+sp[i].charAt(j);
		   }
		   
		    newst=newst+" ";
		    finals=finals+newst;
		    newst="";
	   }
	   
	   
	System.out.println(finals);
		   
	}
}
