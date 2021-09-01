package mycollection__assi;

import java.util.ArrayList;

public class color {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("red");
		al.add("green");
		al.add("yellow");
		al.add("white");
		al.add("black");
		//System.out.println(al);
		ArrayList<String>al2=new ArrayList<>();
		al2.add("red");
		al2.add("green");
		al2.add("yellow");
		al2.add("white");
		al2.add("black");
		al.addAll(al2);
System.out.println(al);
	}

}
