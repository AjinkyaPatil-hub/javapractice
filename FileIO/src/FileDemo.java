/*
 * //to make dir
	//file.mkdir();
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class FileDemo {
public static void main(String[] args) throws IOException {

	File file=new File("F:\\My Study\\abc.txt");
	System.out.println(file.exists());
	file.createNewFile();
//	System.out.println(file.exists());
//	//returns only file of files present in folder
//	String[] list= file.list(); 
//	for(String str:list){
//		File f=new File(file, str);
//		//for dir isDirectory()
//		if(f.isFile()){
//			System.out.println(str);
//		}
//	}
//	System.out.println("All files in F:"+Arrays.toString(list));

	//To write into file true specifies to append the existing data
	FileWriter fw=new FileWriter(file);
	fw.write(" not\nreq");
	fw.write('\n');
	fw.write("problem of FW We have \nto insert \n manually ");
	
	fw.flush();

	}
}
