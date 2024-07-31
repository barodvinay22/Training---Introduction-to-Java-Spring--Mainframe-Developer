import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializationDemo{
    public static void main(String args[])throws Exception{
       
        try{
            FileInputStream fis=new FileInputStream("student.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student student=(Student)ois.readObject();// Type Casting 
            ois.close();
            fis.close();
            System.out.println("Object Saved"+student);
        }catch(IOException ioException){
            ioException.printStackTrace();
        }
    }
}
