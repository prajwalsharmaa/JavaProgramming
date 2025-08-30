import java.io.FileWriter;
public class WriteToFile{
    public static void main(String [] args){
        try{
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello.I am a Java Programmer.");
            writer.close();
            System.out.println("Successfully written to file!");
        }catch(Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}