import java.util.Scanner;

/*
 * 5!=5*4*3*2*1=120
 */
public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=scan.nextInt();
		int fact=1;
		for(int i=no;i>=1;i--){
			fact=fact*i;
			
		}
	
		System.out.println(fact);
		
	}

}
