package DataStructures;
import java.io.*; 
import java.util.*;

public class Java_Generics {
	
	private static void print(List<?> list) 
	{
	    for(Object x : list) 
	    {    
	        System.out.println(x);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInt =  Arrays.asList(1,2,3);
	    List<String> listString = Arrays.asList("Hello","World");

	    print(listInt);
	    print(listString);
	}

}
