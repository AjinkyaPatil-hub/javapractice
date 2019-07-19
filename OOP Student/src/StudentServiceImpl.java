
public class StudentServiceImpl extends StudentServices {
	
	Student[] students=null;
	int index=0;
	 public StudentServiceImpl(int no) {
		 /*
		  * jar user 0 kiva -1 enter kela tar student banar nahi .
		  * no means user enter kelela (menas tevedch students)
		  */
		 if(no<=0){
			 System.out.println("Invalid Student Capacity");
			 System.exit(0);
		 }
		 else{
			 students=new Student[no];
			 System.out.println("Student array is initalized with :"+no+" size");
		 }
	}
	
	@Override
	public String addStudent(Student student) {
		String returnValue="INVALID_STUDENT_ACTIVITY";//This is used when some goes wrong default message
		//validation for student
		if(student==null){
			returnValue="Invalid Student";
		}
		else{
			//id should be greater than 1
			if(student.getStudId()<=0){
				returnValue="Invalid student ID";
				
			}//student age should be from 6 to 25
			else if(student.getStudAge()<6 || student.getStudAge()>25){
				returnValue="Invalid Age";
			}
			else if(getStudent(student.getStudId())!=null){
				returnValue="Duplicate Student";
			}
			else if(index>=students.length){
				returnValue="Student Capacity excided";
			}
			else{
				students[index++]=student;
				returnValue ="Student Success";
			}
			
		}
		return returnValue;
	}

	@Override
	public Student getStudent(int studId) {
		if(studId>0){
			for(Student st:students){
				
				if(st!=null && st.getStudId()==studId){
					return st;
				}
			}
		}
		return null;
	}

	@Override
	public Student[] getStudents() {
		
		return students;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(int studId) {
		// TODO Auto-generated method stub
		return null;
	}

}
