import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class AppMain {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of student you want:");
		int noStud=scanner.nextInt();
		StudentServiceImpl service=new StudentServiceImpl(noStud);
		
		for(int i=0;i<noStud;i++){
		System.out.println("Enter studentID");
		int sId=scanner.nextInt();
		System.out.println("Enter student Name");
		String stName=scanner.next();
		System.out.println("Enter student Age");
		int stAge = scanner.nextInt();
		System.out.println("Enter Student Fees");
		double stFees= scanner.nextDouble();
		
		
		//entering address
		System.out.println("Enter student AdressID");
		int aId=scanner.nextInt();
		System.out.println("Enter student city");
		String stCity=scanner.next();
		System.out.println("Enter student pincode");
		int stPincode=scanner.nextInt();
		
		//data is send to the student class and adress class
		Adress address=new Adress(aId, stPincode, stCity);
		Student student=new Student(sId, stName, stAge, stFees, address);
		System.out.println(service.addStudent(student));
		System.out.println(service.getStudent(sId));
		}
		//to print all students data
		
//		Adress ad=new Adress(2, 55, "sa");
//		Student stu=new Student(2, "as", 22, 25, ad);
//		Adress ad2=new Adress(3, 55, "sa");
//		Student stu2=new Student(2, "as", 22, 25, ad);
//		Adress ad3=new Adress(3, 55, "sa");
//		Student stu3=new Student(4, "as", 22, 25, ad);
		System.out.println("all students"+Arrays.toString(service.getStudents()));

		System.out.println("deleted student"+service.deleteStudent(2));
		
		System.out.println("all students"+Arrays.toString(service.getStudents()));
		
		//System.out.println("Updated stud"+service.updateStudent(stu));
	}
}
