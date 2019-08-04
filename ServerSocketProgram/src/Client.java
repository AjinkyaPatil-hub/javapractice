import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner scan=new Scanner(System.in);
		Socket s=new Socket("127.0.0.1", 1342);
		Scanner sc1=new Scanner(s.getInputStream());
		System.out.println("Enter number");
		int number= scan.nextInt();
		
	}
}
