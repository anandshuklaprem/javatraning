package mycollection__assi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratror {

	public static void main(String[] args) {
		List<Integer>integerList=new ArrayList<>();
	    integerList.add(45);
	    integerList.add(44);
	    integerList.add(55);
	    integerList.add(99);
Iterator iterator=integerList.iterator();
while( iterator.hasNext()) {
	System.out.println("Next element is:"+iterator.next());
	for (int i=0;i<integerList.size();i++) {
	System.out.println(integerList.get(i));
}
	}
	}
}