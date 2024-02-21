public class Student extends User{
    private boolean _verified = false;
    public Student(){
        super();
    }
    public Student(String name, String membership){
        super(name, membership);
    }
    void set_verified(boolean verified){
        _verified = verified;
    }
    boolean get_verified(){
        return _verified;
    }


    //implementing polymorphism for Student class
    void verify(){
        System.out.println("Verifying thru email");
        set_verified(true);
    }
}
