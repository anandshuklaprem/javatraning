package mycollection__assi;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer>hm=new HashMap<>();
		hm.put("pavan",90);
		hm.put("raj",92);
		hm.put("an",94);
		hm.put("van",95);
		hm.put("rajann",91);
		//hashmap normal print
		System.out.println(hm);
		System.out.println(hm.get("pavan"));
		System.out.println();
		
		
//hash map printsamevalue diff string but output is same
String str1=new String("anand");
String str2=new String("anand");
System.out.println(str1.hashCode());
System.out.println(str2.hashCode());

		//HashMap in same string and diff value output is not same its differ
		
String a1="AA";
String a2="BB";
System.out.println(a1.hashCode());
System.out.println(a2.hashCode());


}

}
