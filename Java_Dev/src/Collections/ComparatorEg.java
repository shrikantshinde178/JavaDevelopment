package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class ComparatorEg {

	public static void main(String[] args) {
		
	Employee ee = new Employee(111, "abc", "it");
	Employee ee1 = new Employee(116, "def", "hr");
	Employee ee2 = new Employee(117, "ghi", "it");
	Employee ee3 = new Employee(112, "jkl", "admin");
	Employee ee4 = new Employee(114, "mno", "finance");
	Employee ee5 = new Employee(115, "pqr", "training");
	Employee ee6 = new Employee(113, "xyz", "it");
	Employee ee7 = new Employee(119, "nbv", "training");
	Employee ee8 = new Employee(118, "mmm", "hr");
	
	LinkedList<Employee> ll1 = new LinkedList<Employee>();
	ll1.add(ee);
	ll1.add(ee1);
	ll1.add(ee2);
	ll1.add(ee3);
	ll1.add(ee4);
	ll1.add(ee5);
	ll1.add(ee6);
	ll1.add(ee7);
	ll1.add(ee8);

	
	System.out.println("Sorting by ID");
	Collections.sort(ll1, new IdCompare());
	for(Employee eee : ll1) {
		System.out.println(eee.empId + "  " + eee.empName  +"   "+ eee.dept);
	}
	
	System.out.println("-------------------------------------");
	
	System.out.println("Sorting by Dept");
	Collections.sort(ll1, new DeptCompare());
	for(Employee eee1 : ll1) {
		System.out.println(eee1.empId + "  " + eee1.empName  +"   "+ eee1.dept);
	}
	}

}

