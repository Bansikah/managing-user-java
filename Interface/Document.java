package Interface;

public class Document  implements Printable{

    @Override
    public void printDescription() {
        System.out.println("This is a document.");
    }
    
}
