package XiaoDai;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTestDemo1.Func1();
	}
	
	

}
