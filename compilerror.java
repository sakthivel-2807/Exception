package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class compilerror {
	public static void main (String[]args) throws IOException {
		try {
		File f=new File("C:\\Users\\Dell\\Desktop\\txt.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
			
		}
		
	}

}
