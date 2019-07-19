package FileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {

		char[] ch=new char[50];
		int size=0;
		
		File file=new File("NewFile.txt");//just creates the object of file
		FileWriter fw=new FileWriter(file);//to write into file ,it also created file on hard disk
		FileReader fr=new FileReader(file);//to read data from file
		
		fw.write("yes i am entering into java");
		
		fr.read(ch);
		System.out.println(size );
		
		for(char c:ch)
			System.out.print(c);
		
		fw.flush();
		fw.close();
		fr.close();
		
		
		
	}

}
