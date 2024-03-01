package Abstract;

//Abstract class
public abstract class Shape {

       // Abstract method
    public abstract double calculateArea();
    
    public static void main(String [] args){
        Circle newC = new Circle(2.5);
        newC.printDescription();
        newC.calculateArea();

        

        System.out.println(newC.calculateArea());
    }
    // Concrete method
    public void printDescription() {
        System.out.println("This is a shape.");
    }
}
