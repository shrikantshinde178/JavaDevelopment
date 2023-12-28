//Elements are stored in the order as per entered.
//LinkedHashMap cannot contain duplicate keys.
//LinkedHashMap allows both null keys and null values.
//order is based on the most recently accessed elements.

package Collections;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapEg {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(1234, null);
		m.put(1232, "sam");
		m.put(null, "john");
		m.put(1237, "rohit");
		m.put(null, null);
		m.put(1239, "priya");
		m.put(1238, "pooja");
		m.put(null, null);
		
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
