package OOPS;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk()
	{
		System.out.println("I am walking");
	}
}
class Bird extends Animal
{
	void fly()
	{
		System.out.println("I am flying");
	}
	void sing() {
        System.out.println("I am singing");
    }
}
interface asd{
    void sing();
}
public class Java_Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bird bird = new Bird();
		  bird.walk();
		  bird.fly();
	      bird.sing();

	}

}
