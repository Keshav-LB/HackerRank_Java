package DataStructures;
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Java_Stack {

	public static boolean isBalanced(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		for (int i=0; i<s.length();++i)
		{
            if (s.charAt(i) == '(' ) stack.push('(');
            else if (s.charAt(i) == '{' ) stack.push('{');
            else if (s.charAt(i) == '[' ) stack.push('[');
            
            else if (s.charAt(i) == ')' ) 
            {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '(') return false;
            }
            else if (s.charAt(i) == '}') 
            {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '{') return false;
            }
            else if (s.charAt(i) == ']') 
            {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		
		/*while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
			while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
            System.out.println(input.isEmpty());
		}*/
		
		String line;
		while (sc.hasNextLine()){
            line = sc.nextLine();
            if (isBalanced(line)) System.out.println("true");
            else System.out.println("false");
        }
	}

}
/*
 {}()
({()})
{}(
[]
 */
