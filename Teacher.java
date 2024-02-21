public class Teacher  extends User{

    public Teacher(){
        super();
    }
    public Teacher(String name, String membership){
        super(name, membership);
    }
    
    void verify(){
        System.out.println("Verifying thru phone");
        set_verified(true);
    }
}
