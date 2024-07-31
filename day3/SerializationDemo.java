import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo{
    public static void main(String args[]){
        Student student=new Student();
        student.setId(1);
        student.setName("vinay");
        // student.setAge(25);
        student.setPhoneNumber(123456L);
        try{
            FileOutputStream fos=new FileOutputStream("student.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
            System.out.println("Object Saved");
        }catch(IOException ioException){
            ioException.printStackTrace();
        }
    }
}

