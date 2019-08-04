import java.util.TreeSet;


public class EmployeeMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		EmployeeComparator emp1=new EmployeeComparator("a", 1);
		EmployeeComparator emp2=new EmployeeComparator("b", 2);
		EmployeeComparator emp3=new EmployeeComparator("c",3 );
		EmployeeComparator emp4=new EmployeeComparator("dd", 2);
		EmployeeComparator emp5=new EmployeeComparator("d", 4);
//		TreeSet ts=new TreeSet();
//		ts.add(emp1);
//		ts.add(emp2);
//		ts.add(emp3);
//		ts.add(emp4);
//		ts.add(emp5);
		
		
		//System.out.println(ts);
		
		TreeSet ts=new TreeSet(new EmployeeComparator());
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp4);
		ts.add(emp5);
		
		System.out.println(ts);
		
	}

}

	
