class Employee extends Person {
	double Salary;
	int year;
	String insur;
	public Employee(String name,double Salary,int year,String insur) {
		super(name);
		this.Salary=Salary;
		this.year=year;
		this.insur=insur;
	}
	public double getSalary() {
		return Salary;
	}
	public int getYear() {
		return year;
	}
	public String getInsur() {
		return insur;
	}

	
}
