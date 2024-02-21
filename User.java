import java.util.List;

public class User {
   private String _name;
   private String _membership = "Silver";
   private boolean _verified = false;

   //creating a static list
   public static List<User> admins;

   //creating a static method
   public static void print_admins(){
    for( User u : admins){
        System.out.println(u.get_name());
    }
   }

//method overriding
   @Override
   public String toString(){
       //return "Name: " + _name + "\nMembership: " + _membership;
       return get_name() + "\n" + get_membership();
   }

   public boolean equals(User user2){
       if (this.get_name() == user2.get_name() && this.get_membership() == user2.get_membership()){
           return true;
       }
       return false;
   }

   //creating a default constructor
   public User(){
   }
   //Creating a constructor
   public User(String name, String membership){
       set_name(name);
       set_membership(membership);
   }
    
    void set_name(String name){
        _name = name;
    }

    String get_name(){
        return _name;
    }

    void set_membership(String membership){
        _membership = membership;
    }

    String get_membership(){
        return _membership;
    }
    //Method overloading
    public enum Membership{
        Silver,
        Gold,
        Platinum;
    }
    void set_membership(Membership membership){
        _membership = membership.name();
    }
   

    void verify(){
        System.out.println("Verifying....");
        set_verified(true);
    }

    void set_verified(boolean verified){
        _verified = verified;
    }

    boolean get_verified(){
        return _verified;
    }
    
}
