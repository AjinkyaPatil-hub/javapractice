import java.util.Comparator;


public class EmployeeComparator implements  Comparable,Comparator{

	String name;
	int eid;
	
	
	public EmployeeComparator() {
		super();
	}
	public EmployeeComparator(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", eid=" + eid + "]";
	}
	@Override
	public int compareTo(Object arg0) {
		int eid1=this.eid;
		EmployeeComparator e=(EmployeeComparator)arg0;
		int eid2=e.eid;
		if(eid1<eid2){
			return -1;
		}else if(eid1>eid2){
			return +1;
		}else{
			return 0;
		}
		
	}
	@Override
	public int compare(Object o1, Object o2) {
		EmployeeComparator e1=(EmployeeComparator)o1;
		EmployeeComparator e2=(EmployeeComparator)o2;
		//by id sorting
		Integer eid1=e1.eid;
		Integer eid2=e2.eid;
		return eid1.compareTo(eid2);

		
		//		//by name
//		String s1= e1.name;
//		String s2= e2.name;
//		return s1.compareTo(s2);
		
		

		//comparator internal logic
//		if(eid1<eid2){
//			return +1;
//		}else if(eid1>eid2){
//			return -1;
//		}else{
//			return 0;
//		}
		
	}




	
}
