package task11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Path;

public class Question8 {

	public void file() throws FileNotFoundException {

Path Filename = Path.of("C:\\Users\\Anbu Rose\\eclipse-workspace\\guvipractice\\src\\task10");
try {
	readFile(Filename);//Attempt to read from the file
	throw new FileNotFoundException ("Error file not found.");
	
} catch (FileNotFoundException e) {//handle file not found exception
	// TODO Auto-generated catch block
	System.out.println ("Error File not found. Please create a new file");
	e.printStackTrace();//to print the entire path
}
	}		
		private void readFile(Path filename) {//read file private method is created
		// TODO Auto-generated method stub
		
	}
		public static void main(String[] args) throws FileNotFoundException  {
			// TODO Auto-generated method stub
Question8 obj = new Question8();//creating object for main class
obj.file();	
	}

}
