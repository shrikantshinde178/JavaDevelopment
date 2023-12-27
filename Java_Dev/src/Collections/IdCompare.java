package Collections;

import java.util.Comparator;

	public class IdCompare  implements Comparator<Employee>{

		@Override
		public int compare(Employee e1, Employee e2) {
			if(e1.empId == e2.empId) 
			return 0;
			else if(e1.empId >e2.empId) 
				return 1;
				else 
					return -1;
			
		}
	}

