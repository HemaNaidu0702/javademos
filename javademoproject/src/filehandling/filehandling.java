package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filehandling {
   public static void main(String[] args) {
        inputstreamdemo();
        // outputstreamdemo();
   }


public static void inputstreamdemo() {
	   int i;
	   File file = new File("/c:/javafsd/javademos/myfile");
	   try {
		FileInputStream fis = new FileInputStream(file);
		System.out.println("File opened");
		while((i= fis.read()) != -1) {
			System.out.print((char)i);
		}
		fis.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public static void outputstreamdemo() {
	   int i;
	   File file = new File("/c:/javafsd/javademos/myfile");
	   try {
		FileOutputStream fos = new FileOutputStream(file);
		System.out.println("File opened");
		fos.write("from the program".getBytes());
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}