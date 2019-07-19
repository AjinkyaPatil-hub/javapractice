import java.util.Scanner;

/*
 * prime num 
 * a num is divided by itself or by 1
 * eg 1,2,3,5,7,11 etc
 */
public class Prime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int no = scan.nextInt();

		prime(no);
//		

	}

	public static void prime(int no) {
		boolean isprime=false;
			for (int i = 2; i < no; i++)
			{
				if (no % i == 0) {
					isprime= false;
					break;
				} else 
					isprime=true;
			}
			if(isprime)
				System.out.println("number is prime");
			else
				System.out.println("not");
		}
			
	
}
