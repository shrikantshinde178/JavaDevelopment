package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEg {
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1234, "rohit");
		m.put(1235, "sam");
		m.put(1236, "john");
		m.put(1237, "rohit");
		m.put(null, null);
		m.put(1239, "priya");
		m.put(1238, "pooja");
		
		//traversing map
		Set<Entry<Integer, String>> set = m.entrySet(); //convert to set for traverse
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext()) {
			//convert to Map.entry for getting key & values separate
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() +"  "+ entry.getValue());
		}
		
	}

}
