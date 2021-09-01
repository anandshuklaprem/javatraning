package mycollection__assi;

import java.util.ArrayList;
import java.util.Collections;

public class swapelementarraylist {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		System.out.println(al);   //before swaping
		Collections.swap(al,1,4);
		System.out.println(al);//swaping

	}

}
