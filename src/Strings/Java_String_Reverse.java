package Strings;
import java.io.*;
import java.util.*;
public class Java_String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String s = new String("madam");
		StringBuilder s1 = new StringBuilder();
		
		s1.append(s);
		s1.reverse();
		String rev = s1.toString();
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(s.equals(rev) ? "Yes" : "No");

	}

}
