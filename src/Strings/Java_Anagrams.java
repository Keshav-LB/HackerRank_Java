package Strings;
import java.util.Scanner;
public class Java_Anagrams {
	
	 static boolean isAnagram(String a, String b) {
	        // Complete the function
		 a=a.toLowerCase();
	     b=b.toLowerCase();
	     
	     if(a.length()==b.length())
	     {
	    	 int[] x = new int[500];
	         int[] y = new int[500];
	         
	    	 for (int i = 0; i < a.length(); i++)
	    	 	{
	                x[a.charAt(i)] += 1;
	                y[b.charAt(i)] += 1;
	            }
	          for (int i = 0; i < 500; i++) 
	          	{
	                if (x[i] != y[i])
	                    return false;
	            }
	            return true;
	     }
	     
	     else
	        {
	            return false;
	        }
	     
		 
	    }

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
