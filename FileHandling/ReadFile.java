import java.util.Scanner;
import java.io.File;

public class ReadFile{
    public static void main(String[] args){
        try{
            File file = new File("example.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }catch(Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}