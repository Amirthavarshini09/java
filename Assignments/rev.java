package day3;

import java.util.Scanner;

public class rev {
	void reverseString(String string)   
	{   
	if ((string==null)||(string.length() <= 1))   
	System.out.println(string);   
	else  
	{   
	System.out.print(string.charAt(string.length()-1));   
	reverseString(string.substring(0,string.length()-1));   
	}   
	}   
	public static void main(String[] args)   
	{   
	Scanner myObj = new Scanner(System.in);
	String str = myObj.next();
	rev rs = new rev();  
	rs.reverseString(str);   
	}        
}