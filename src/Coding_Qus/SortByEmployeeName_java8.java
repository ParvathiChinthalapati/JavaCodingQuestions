package Coding_Qus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Print List of Employees sort by Empname

public class SortByEmployeeName_java8 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(12,"Parvathi",45.3, null);
		Employee emp2 = new Employee(22,"Surya",98.3, null);
		Employee emp3= new Employee(32,"Eshaan",05.3, null);
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		List<Employee> sortedList = empList.stream().sorted(Comparator.comparing(Employee::getName)).toList();
		for(Employee e:sortedList) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
		}
	}

}
