package DataStructures;
import java.io.*;
import java.util.*;

public class Java_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		List<Integer> list = new LinkedList<>();
		
		while (size-- > 0) {
            int v = in.nextInt();
            list.add(v);
        }
		
		int queries = in.nextInt();
		
		while(queries-- > 0)
		{
			String s = in.next();
            if (s.equals("Insert")) {
                int index = in.nextInt();
                int value = in.nextInt();
                list.add(index, value);
            } else {
                int index = in.nextInt();
                list.remove(index);
            }
		}
		/*for(Iterator<Integer> it= list.iterator(); it.hasNext();)
        {
            java.lang.Integer x = it.next();
            System.out.print(x);
        }*/
		int count = 0;
        for (Integer number : list) {
            System.out.print(number);
            if (count != list.size() - 1) {
                System.out.print(" ");
            }
            count++;
        }

	}

}
