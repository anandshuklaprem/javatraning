package mycollection;

import java.util.ArrayList;

public class replace {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.set(2,"e");
		System.out.println(al);
	
	}

}
