import java.util.Scanner;


public class AppMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number of student you want:");
		int noStud=scanner.nextInt();
		StudentServices service=new StudentServiceImpl(noStud);
		
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
		System.out.println("all students"+service.getStudents());
	}
}
