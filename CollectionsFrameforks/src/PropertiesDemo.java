import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		Properties p=new Properties();
		FileInputStream fip=new FileInputStream("F:\\abc.properties.txt");
		p.load(fip);
		System.out.println(p);
		String pass=p.getProperty("password");
		System.out.println(pass);
		p.setProperty("username", "scoting");
		FileOutputStream fop=new FileOutputStream("F:\\abc.properties.txt");
		p.store(fop, "updated username :!! by ajinkya");
		
	}

}
