// Import the File class
import java.io.File; 

public class DeleteAFile {
	public static void main(String[] args)
	{
		File obj = new File("myfile");
		if (obj.delete()) {
			System.out.println("The deleted file is : "
							+ obj.getName());
		}
		else {
			System.out.println(
				"Failed in deleting the file.");
		}
	}
}
