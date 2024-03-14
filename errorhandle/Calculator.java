package errorhandle;

public class Calculator {
    public Calculator() {
    }

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int numerator, int denominator) throws ArithmeticException{
        if(denominator == 0){
    throw new ArithmeticException("number divided by zero is not allowed");
        }else{
            return numerator/denominator;
        }
    }
}
