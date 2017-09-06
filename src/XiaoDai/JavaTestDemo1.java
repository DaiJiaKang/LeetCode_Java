package XiaoDai;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;


public class JavaTestDemo1 {

	public static void Func1() {
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		Iterator<Integer> it = array.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//Stack<Integer> st = new Stack<Integer>();
		LinkedList<Integer> linklist = new LinkedList<Integer>();
		ListIterator<Integer> at = linklist.listIterator();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<A> array = new ArrayList<A>();
		//A a = new A("xiaodai");
		B b = new B(23, "xiaodai");
		array.add(b);
	}
}

class A {
	String name;
	public A(String name) {
		super();
		this.name = name;
	}
}

class B extends A {
	int age;
	public B(int age, String name) {
		super(name);
		this.age = age;
	}
}








