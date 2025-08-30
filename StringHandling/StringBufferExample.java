public class StringBufferExample{
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append("World");
        stringBuffer.insert(5,"Java");
        System.out.println("Modified String Buffer: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("Modified String Buffer: " + stringBuffer);
    }
}
