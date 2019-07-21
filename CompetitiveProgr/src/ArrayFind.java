import java.util.Scanner;


/*
 * Input:
2 -> total test cases
4 -> size of an array
1 2 3 4 ->array
3 ->to serach and element in array and return the index
5 ->array size
10 90 20 30 40 
40 -search element
Output:
2
4
 */
public class ArrayFind {

	public static void main(String[] args) {
		//int arrsize=0;
		System.out.println("Enter the no. of test cases");
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		int i=0;
		//int[] arr;
		while(i<test){
			System.out.println("Enter size of array:");
			Scanner arrsize=new Scanner(System.in);
			int size=arrsize.nextInt();
			int[] arr=new int[size];
			i++;
		}
		
	}

}
