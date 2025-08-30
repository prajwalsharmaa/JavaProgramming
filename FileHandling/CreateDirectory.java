import java.io.File;
public class CreateDirectory{
    public static void main(String [] prajwal){
        File dir = new File("myFolder");
        if(dir.mkdir()){
            System.out.println("Directory Created!");
        }else{
            System.out.println("Directory Already Exists");
        }
    }
}