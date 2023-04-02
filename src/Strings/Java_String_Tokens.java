package Strings;
import java.io.*;
import java.util.*;

public class Java_String_Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        
	        StringTokenizer stk = new StringTokenizer(s," ,!?._'@");
	        String s1;
	        ArrayList<String> al = new ArrayList<>();
	        
	        while(stk.hasMoreTokens())
	        {
	        	s1=stk.nextToken();
	        	al.add(s1);
	        	
	        }
	        System.out.println(al.size());
        
        	al.forEach((x)->System.out.println(x));
	        
	        
	        scan.close();
	}

}
