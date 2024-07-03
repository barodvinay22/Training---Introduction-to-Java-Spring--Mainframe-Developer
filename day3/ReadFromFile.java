// Import the File class
import java.io.File;

// Import this class for handling errors
import java.io.FileNotFoundException; 

// Import the Scanner class to read content from text files
import java.util.Scanner; 

public class ReadFromFile {
	public static void main(String[] args)
	{
		try {
			File obj = new File("myfile");
			Scanner reader = new Scanner(obj);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("An error has occurred.");
			//e.printStackTrace();
		}
	}
}
