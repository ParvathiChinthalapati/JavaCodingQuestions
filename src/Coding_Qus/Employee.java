package Coding_Qus;

public class Employee {
	int id;
	String name;
	double sal;
	String dept;
	
	
	public Employee(int id, String name, double sal, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	

}
