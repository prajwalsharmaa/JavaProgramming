public class StringHandling{
    public static void main(String [] args){
        //Handling Strings
        //a.Concatenation
        //b.Conversion
        //c.Changing Case
        //d.Extracting Character
        //e.Searching Strings
        
        // String firstName = "Prajwal";
        // String lastName = "Sharma";
        // String fullName = firstName + " " +lastName;
        // firstName += " "+lastName;
        // System.out.println(firstName);
        // System.out.println(fullName);

        int number = 123;
        // System.out.println(number.getClass().getName());

        String strNum = String.valueOf(number);

        System.out.println(strNum.getClass().getName());

        System.out.println(strNum);

        System.out.println("-----------------------------------------------");



        String mixedCase = "Hello World!";

        System.out.println("To Upper Case: " + mixedCase.toUpperCase());

        System.out.println("To Lower Case: " + mixedCase.toLowerCase());

        System.out.println("-----------------------------------------------");


        //Extracting Character
        
        String name = "Programming";
        
        char firstChar = name.charAt(0);
        char fifthChar = name.charAt(4);

        System.out.println("First Character: "+ firstChar);
        System.out.println("Fifth Character: "+ fifthChar);

        System.out.println("-----------------------------------------------");


        //String Comparison


        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "java";

        System.out.println("s1 == s2: "+(s1 == s2));
        System.out.println("s1 == s3: "+(s1 == s3));

        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println("-----------------------------------------------");


        //String Searching

        String text = "Java is a programming language";

        //Check if contains

        System.out.println("Contains Programming ? : " + text.contains("programming"));

        int firstIndex = text.indexOf("Java");
        System.out.println("First 'Java' is at : "+firstIndex);

        //Count number of vowels and consonants in the word "Nepathya College"; 

    }
}