package Strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tag_Content_Extractor {

	public static void main(String[] args) {
		String Myregex = "<(.+)>(([^<>]+))</\\1>";
		Pattern r = Pattern.compile(Myregex);
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases>0){
			String line = in.nextLine();			
			//System.out.println(line.matches("<(.+)>(([^<>]+))</\\1>"));		
			Matcher matcher = r.matcher(line);
	         int counter = 0;
	         while (matcher.find()) {
	             System.out.println(matcher.group(2));
	             counter++;
	         }
	         if (counter == 0) System.out.println("None");
	         testCases--;
		}
	}

}
