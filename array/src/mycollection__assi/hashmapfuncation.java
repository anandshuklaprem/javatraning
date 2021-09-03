package mycollection__assi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapfuncation {

	public static void main(String[] args) {
		HashMap<String,Integer>hm=new HashMap<>();
		hm.put("pavan",90);
		hm.put("raj",92);
		hm.put("an",94);
		hm.put("van",95);
		hm.put("rajann",91);
		
		
		
		//every funcation is diffrent to each other anand don't forget
		
		
		System.out.println(hm.get("pavan"));
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("pavan"));
		System.out.println(hm.containsValue(90));
		//iterate over it
		Set<String> kk=hm.keySet();
		System.out.println(kk);
		for(String k:kk)
			System.out.println(k+"->"+hm.get(k));
Set<Entry<String,Integer>>ee=hm.entrySet();
for(Entry<String,Integer>e:ee) {
//	System.out.println(e.getKey()+"-->"e.getValue(););
}

}
	}


