package Collections;

import java.util.Comparator;

public class DeptCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.dept.compareTo(e2.dept);
	}

}
