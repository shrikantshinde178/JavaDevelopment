//Simple ArrayList Program

package Java_Labs;

import java.util.ArrayList;

public class arrayListEg {

	public static void main(String[] args) {
		
		//Declaring array list
		ArrayList<Integer> aa = new ArrayList<Integer>();
		
		System.out.println(aa.isEmpty());
		
		aa.add(01);
		aa.add(03);
		aa.add(04);
		aa.add(05);
		aa.add(06);
		aa.add(1, 8348);
		aa.add(010);
		aa.add(7, 10);
		
		//Adding element at specific index
		aa.add(1231);
		aa.add(179);
		aa.add(10);
		
		//Now checking elements are their or not?
		System.out.println(aa.isEmpty());
		
		//Printing array elements
		for(int i=0; i<aa.size(); i++) {
			System.out.println(aa.get(i));
		}


	}

}