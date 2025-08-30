
public class StringMethods{
    public static void main(String[] args){
        String oriString = "Java Programming   ";
        String trimmedString = oriString.trim();
        System.out.println("Removed White-Spaces String: "+ trimmedString);

        System.out.println("--------------------------------------------------");

        String replacedString = trimmedString.replace("Java","Python");
        System.out.println("Replaced String: "+replacedString);

        System.out.println("--------------------------------------------------");

        //Concatenation
        String newString = replacedString.concat(" is used for Artificial Intelligence");
        System.out.println(newString);

        System.out.println("--------------------------------------------------");
        
        //String buffer
        
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append("World");

    }
}