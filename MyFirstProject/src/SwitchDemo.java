import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class SwitchDemo {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//taking input from user by using BufferReader
		int choice;
		System.out.println("enter choice");
//		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//	    choice= Integer.parseInt(bf.readLine());
////		//System.out.println(choice);
	
		Scanner sc=new Scanner(System.in);
		choice= sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("you are in 1");
			break;
		case 2:
			System.out.println("you are in 2");
			break;

		default:
			System.out.println("wrong output");
			break;
		}
		
	}

}
