package Strings;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Regex_Duplicate_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String regex = "/* Write a RegEx matching repeated words here. */";
	     //   Pattern p = Pattern.compile(regex, /* Insert the correct Pattern flag here.*/);
		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	        Scanner in = new Scanner(System.in);
	        int numSentences = Integer.parseInt(in.nextLine());
	        
	        while (numSentences-- > 0) {
	            String input = in.nextLine();
	            
	            Matcher m = p.matcher(input);
	            
	            // Check for subsequences of input that match the compiled pattern
	            while (m.find()) {
	                input = input.replaceAll(m.group(), m.group(1));
	            }
	            
	            // Prints the modified sentence.
	            System.out.println(input);
	        }
	        
	        in.close();
	}

}
