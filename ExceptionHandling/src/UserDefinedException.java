/*
 * create user defined execption that 
 * if user enter value<=0 exception should not stop
 * and application should not break
 */
import java.util.Scanner;


public class UserDefinedException {

	public static void main(String[] args) {

		boolean flag=true;
		while(flag){
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter num1");
			int num1= scan.nextInt();
			Scanner scan2=new Scanner(System.in);
			System.out.println("Enter num2");
			int num2= scan.nextInt();
			try{
			calculation(num1, num2);
			}
			catch(IllegalValue e){
				System.out.println(e.getMessage());
			}
			
			System.out.println("Do you want ro cont: press N to no and press any key to cont.");
			String choice=scan.next();
			if(choice.equalsIgnoreCase("n")){
				break;
			}
			
			scan.close();
			scan2.close();
			
		}
		
	
	}

public static void calculation(int num1,int num2) {
	int res=0;
	if(num1<=0){
		throw new IllegalValue("number1 must be >0");
	}else if(num2<=0){
		throw new IllegalValue("number2 must be >0");
	}else{
		res=num1+num2;
		System.out.println("res: "+res);
	}
}
	
}
//this is our exception class
class IllegalValue extends RuntimeException{
	public IllegalValue(String msg) {
		super(msg);
	}
		
}


