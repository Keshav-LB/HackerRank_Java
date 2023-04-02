package DataStructures;
import java.util.*;
import java.io.*;

public class Java_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm=new HashMap<>();
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			hm.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			System.out.println(hm.containsKey(s)?s+"="+hm.get(s):"Not found");
		}

	}

}
/*
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry*/