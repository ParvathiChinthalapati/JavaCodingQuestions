package Coding_Qus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Input -> you have list of Employees with salary
You need to fetch employee name who are having same salary in desired format as below.

sal  Empname
300.0  Emp1,Emp4
400.0  Emp2,Emp5
500.0  Emp3

*/
public class PrintDesiredOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1, "Emp1", 300, "dept1");
		Employee emp2 = new Employee(2, "Emp2", 400, "dept2");
		Employee emp3 = new Employee(3, "Emp3", 500, "dept3");
		Employee emp4 = new Employee(4, "Emp4", 300, "dept4");
		Employee emp5 = new Employee(5, "Emp5", 400, "dept5");

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);

		Map<Double, String> salaryToEmpName = employeeList.stream().collect(Collectors.groupingBy(Employee::getSal,
				Collectors.mapping(Employee::getName, Collectors.joining(","))));

		System.out.println("sal  Empname");
		salaryToEmpName.forEach((sal, empNames) -> System.out.println(sal + "  " + empNames));
	}

}
