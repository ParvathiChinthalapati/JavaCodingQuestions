package Coding_Qus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
/* Find Employee Count working in same Department */
public class getCountOfEmployee_GroupByDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(1,"parvathi" ,1200,"Dept1");
		Employee emp2 = new Employee(2,"surya" ,1200,"Dept2");
		Employee emp3 = new Employee(3,"esha" ,1200,"Dept3");
		Employee emp4 = new Employee(3,"hello" ,1200,"Dept3");
		
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		Map<String, Long> countMap= empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		
		//countMap.entrySet().stream().forEach(Entry.);
		Iterator<Entry<String, Long>> itr = countMap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<String, Long> entry = (Entry<String, Long>) itr.next();
			System.out.println(" "+entry.getKey()+"  "+entry.getValue());
		}
		
	
		
	}

}
