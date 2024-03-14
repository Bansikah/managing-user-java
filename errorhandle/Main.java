package errorhandle;

public class Main {
     public static void main(String[] args) {
       Calculator calculator = new Calculator();
         int result;
         result = calculator.add(10,20);
         System.out.println(result);

         try {
             result = calculator.divide(10, 10);
             System.out.println(result);
         }
         catch (ArithmeticException e) {
           System.out.println("Error: " + e.getMessage());
       }
         finally {
         System.out.println("Finally");
         }
    }

}
