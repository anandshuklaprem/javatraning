package mycollection__assi;

import java.util.ArrayList;
import java.util.Collections;

public class reverse {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.forEach(x->System.out.println(x));
		Collections.reverse(al);
		System.out.println(al);
		
	}

}
