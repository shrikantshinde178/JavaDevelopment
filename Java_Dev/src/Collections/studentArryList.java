//This is ArrayList program; having two separate files. 
// - StudentDetails.java & StudentArrayList.java
//this file contain main method and student declaration
//and another file have separate parameter's declared their and constructor as well.
//Iterator method(hasNext(), has())

package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class studentArryList {
	public static void main(String[] args) {
		
		//creation of object for class StudentDetails
		StudentDetails s1 = new StudentDetails(11, "ram", 987654321, true);
		StudentDetails s2 = new StudentDetails(12, "bharti", 887654321, true);
		StudentDetails s3 = new StudentDetails(13, "vishal", 687654321, false);
		StudentDetails s4 = new StudentDetails(15, "kabir", 667654321, true);
		StudentDetails s5 = new StudentDetails(14, "john", 733654321, false);
		StudentDetails s6 = new StudentDetails(16, "komal", 900654321, true);
		StudentDetails s7 = new StudentDetails(17, "priya", 777654321, false);
		StudentDetails s8 = new StudentDetails(18, "sam", 998654321, true);
		
		//creating ArrayList
		ArrayList<StudentDetails> aa2 = new ArrayList<StudentDetails>();
		aa2.add(s8); //adding StudentDetails class object
		aa2.add(s4);
		aa2.add(s5);
		aa2.add(s1);
		aa2.add(s2);
		aa2.add(s3);
		aa2.add(s7);
		aa2.add(s6);
		
		//traversing using iterator
		Iterator<StudentDetails> i = aa2.iterator();
		while(i.hasNext()) {
			StudentDetails ss= i.next();
			System.out.println(ss.sid +"\t"+ ss.sname +"\t"+ ss.sphone + "\t"+ ss.graduate);
		}
	}
}
