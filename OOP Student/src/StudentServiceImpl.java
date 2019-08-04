public class StudentServiceImpl extends StudentServices {

	Student[] students = null;
	int index = 0;
	int tempindex = 0;

	public StudentServiceImpl(int no) {
		/*
		 * jar user 0 kiva -1 enter kela tar student banar nahi . no means user
		 * enter kelela (menas tevedch students)
		 */
		if (no <= 0) {
			System.out.println("Invalid Student Capacity");
			System.exit(0);
		} else {
			students = new Student[no];
			System.out.println("Student array is initalized with :" + no
					+ " size");
		}
	}

	@Override
	public String addStudent(Student student) {
		String returnValue = "INVALID_STUDENT_ACTIVITY";// This is used when
														// some goes wrong
														// default message
		// validation for student
		if (student == null) {
			returnValue = "Invalid Student";
		} else {
			// id should be greater than 1
			if (student.getStudId() <= 0) {
				returnValue = "Invalid student ID";

			}// student age should be from 6 to 25
			else if (student.getStudAge() < 6 || student.getStudAge() > 25) {
				returnValue = "Invalid Age";
			} else if (getStudent(student.getStudId()) != null) {
				returnValue = "Duplicate Student";
			} else if (index >= students.length) {
				returnValue = "Student Capacity excided";
			} else {
				students[index++] = student;
				// this will give us the actual size of th array created
				tempindex++;
				returnValue = "Student Success";
			}

		}
		return returnValue;
	}

	@Override
	public Student getStudent(int studId) {
		String returnValue = "INVALID STUDENT";
		if (studId > 0) {
			for (Student st : students) {
				if (st != null && st.getStudId() == studId) {
					return st;
				}
			}
		}

		return null;
	}

	@Override
	public Student[] getStudents() {
		Student[] tempstudent = new Student[tempindex];
		int count = 0;

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				tempstudent[count++] = students[i];
			}
		}
		return tempstudent;
	}

	@Override
	public Student updateStudent(Student student) {
		boolean isFoundStud = false;

		if (student != null) {// user ne sahi pass kiya hai ya nahi
			if (student.getStudId() > 0) { // id must be greater than 0
				for (int i = 0; i < students.length; i++) {
					Student lstud = students[i];
					if (lstud != null
							&& lstud.getStudId() == student.getStudId()) {

						isFoundStud = true;

						if (student.getStudAge() < 3
								|| student.getStudAge() > 26) {
							System.out.println("INvalid Age");
						} else {
							lstud.setAdress(student.getAdress());
							lstud.setStudAge(student.getStudAge());
							lstud.setStudFees(student.getStudFees());
							lstud.setStudName(student.getStudName());
							lstud.setCollegeName(student.getCollegeName());
							System.out.println("Student suceessfully updated");
							return getStudent(student.getStudId());
							
						}
					}
				}
				if(!isFoundStud){
					System.out.println("Student not found");
				}
			} else {
				System.out.println("Invalid student id");
			}
		} else {
			System.out.println("Invalid Student");
		}

		return null;
	}

	@Override
	public String deleteStudent(int studId) {
		String returnValue="Problem in deleting student";
		if(studId<=0){
			returnValue="Invalid ID";
			
		}else if(getStudent(studId)==null){
			returnValue="student with nullnot found";
			
		}else{
			for(int i=0;i<students.length;i++){
				Student lstud = students[i];
				if(lstud!=null && lstud.getStudId()==studId){
					students[i]=null;
					tempindex--;
					return "Student deleted";
				}
			}
			
			
		}
		return returnValue;
	}

}
