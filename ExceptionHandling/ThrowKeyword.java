public class ThrowKeyword {
    public static void main(String[] args) {
        int number = -10;
        try {
            if (number < 0) {
                throw new CustomExceptions.CustomErrorException("Number Cannot Be Negative");
                // ^^^ Corrected spelling: CustomErrorException
            }
            System.out.println("Valid Number: " + number);
        } catch (Exception e) {
            System.out.println("Custom Error: " + e.getMessage());
        } finally {
            System.out.println("Cleaning resources...");
        }
    }
}
