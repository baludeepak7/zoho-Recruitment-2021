
public class Patternclass {

	public static void main(String args[])   
	{    
	String userin=args[0];
	String sfter=userin.substring(userin.length()/2, userin.length());
	String before=userin.substring(0, userin.length()/2);
	String input=sfter+before;
	int i, j, row = input.length();        
	for (i=0; i<row; i++)   
	{       
	for (j=2*(row-i); j>=0; j--)         
	{     
	System.out.print(" ");   
	}   
	for (j=0; j<=i; j++ )   
	{      
	System.out.print(input.charAt(j)+" ");   
	}    
	System.out.println();   
	}   
	}   
}
