package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class BooK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll=new LinkedList();
ll.add("100");
ll.add('y');
ll.add(54.2);
System.out.println(ll);

	
ArrayList al=new ArrayList(ll);

al.add("aaa");
al.add("bbb");
al.add("ccc");
System.out.print(al);
}
}