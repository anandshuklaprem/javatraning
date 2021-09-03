package mycollection__assi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashstudent {

	public static void main(String[] args) {
HashSet<String>hs=new HashSet<>();
hs.add("neha");
hs.add("raj");
hs.add("ne");
hs.add("ha");
System.out.println(hs);
	for(String s:hs)
		System.out.println(s);
	Iterator<String>i=hs.iterator();
		while(i.hasNext()) {
	
		String ss=i.next();
		System.out.println(ss);
		}
		//HashSet<Emp>hs3=new HashSet<>();
		//hs3.add(new Emp(1,"raj",90000));
		//hs3.add(new Emp(2,"ra",90000));
		//System.out.println(hs3);
		LinkedHashSet<Integer>l=new LinkedHashSet<>();
		l.add(234);
		l.add(1);
		l.add(3);
		System.out.println(l);
		
	TreeSet<Double>ts= new TreeSet<>();
	ts.add(9.6);
	ts.add(9.4);
	ts.add(3.6);
	ts.add(2.6);
	System.out.println(ts);
	}	
		

}
