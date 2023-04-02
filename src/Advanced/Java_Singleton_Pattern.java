package Advanced;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton{
    
static Singleton instance = new Singleton();
    
    private Singleton() {
        
    }
    
    public String str;
    
    static Singleton getSingleInstance() {
        return instance;
    }

}

/*public class Java_Singleton_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
