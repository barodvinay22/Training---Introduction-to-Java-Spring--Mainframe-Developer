// Import the FileWriter class
import java.io.FileWriter; 

// Import the IOException class for handling errors
import java.io.IOException; 

public class WriteToFile {
	public static void main(String[] args) throws IOException
	{		
		try(FileWriter writer=new FileWriter("myfile")) {// try with resource 
				writer.write(
				"Files without extension");
				// int d=10/0;
				
			System.out.println("Successfully written.");
		}
		// catch (IOException e) {
		// 	System.out.println("An error has occurred.");
		// 	e.printStackTrace();
		// }
		
		
	}
}
