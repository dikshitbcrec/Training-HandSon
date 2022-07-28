
import java.util.Iterator;
import java.util.Vector;

public class VectorDb {
	Vector<Employee> li= new Vector<>();
	boolean addEmployee(Employee e)
	{
		li.add(e);
		return true;
	}
	boolean deleteEmployee(int empid)
	{
		Iterator<Employee> it=li.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			if(e.empId==empid)
			{
				it.remove();
				return true;
			}
			
		}
		return false;
	}
	String showPaySlip(int empid)
	{
		Iterator<Employee> it=li.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			if(e.empId==empid)
			{
				return "Employee Id : "+e.empId+ " Employee Name :"+e.empName+" Salary : " +e.salary;
			}
		}
		return "Employee Doesn't Exist";
	}
	
}
