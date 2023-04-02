package Strings;
import java.util.*;
public class Java_Substring_Comparisions {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;       
        
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        ArrayList<String> a = new ArrayList<>();
       

        for(int i=0;i<s.length()-k+1;i++)
        {
                a.add(s.substring(i,i+k));  
                
        }
        System.out.println(a);
        
        
        Collections.sort(a);
        System.out.println(a);
         smallest = a.get(0);
         largest = a.get(a.size()-1);
        return smallest + "\n" + largest;
    }

	public static void main(String[] args) {
		
	        String s = "welcometojava";
	        int k = 3;
	      	      
	        System.out.println(getSmallestAndLargest(s, k));
	}

}
