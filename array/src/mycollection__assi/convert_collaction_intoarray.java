package mycollection__assi;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class convert_collaction_intoarray {

	public static void main(String[] args) {
		
ArrayList<Integer> list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
Integer[]intArray=new Integer[list.size()];
list.toArray(intArray);
for(Integer integer:intArray) {
	System.out.println(integer);
}

	}

}