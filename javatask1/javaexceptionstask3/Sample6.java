package javaexceptionstask3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//try catch finally
public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fileScanner=null;
		try {
			File file=new File("sample.txt");
			fileScanner=new Scanner(file);
			while(fileScanner.hasNextLine()) {
				String line=fileScanner.nextLine();
				System.out.println(line);
			}
		}catch(FileNotFoundException e) {
			System.out.println("file not found.please check the file path.");
		}finally {
			if(fileScanner!=null) {
				fileScanner.close();
				System.out.println("Scanner closed");
			}
		}
	}

}
