package basicApis.ThreadClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class ReadFileUsingThreadClass extends Thread{

	@Override
	public void run() {
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader
				(new File("C:\\Users\\sonar\\git\\MultiThreading-Cocurrency\\JavaSEConcurrencyAPIStudyProject\\src\\main\\java\\Resources\\sample.txt")))){
			String line = null;
			while((line = bufferedReader.readLine())!=null) {
				System.out.println(Thread.currentThread().getName()+" reading the line " + line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
