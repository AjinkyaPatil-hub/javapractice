import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerilzationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Book book=new Book(1, "java", 525.5, "PQRS");
		//serilization converting object to file
		File file=new File("F:\\scoopen java notes\\aa.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(book);
		
		//deserilizable converting file into object
		FileInputStream fip=new FileInputStream("F:\\scoopen java notes\\aa.txt");
		ObjectInputStream ois=new ObjectInputStream(fip);
		Book rbook= (Book)ois.readObject();
		
		System.out.println(book);
		System.out.println(rbook);
		
	}

}
