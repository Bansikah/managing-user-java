import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        Student s = new Student("Noel", "Gold");
        s.set_verified(true);
        System.out.println(s.get_verified());

        Teacher t = new Teacher();
        t.set_name("Teacher");
    
        // User user1 = new User("Noel", "Gold");
        // User user2 = new User("Noel", "Gold");
        //creating generic list
        //ArrayList<User> userList = new ArrayList<>();

        User.admins = new ArrayList<>();
        User.admins.add(s);
        User.admins.add(t);
        User.admins.add(new User("Noel", null));
        User.admins.add(new Teacher("Caleb", "Gold"));
        User.admins.add(new Student("Noel", "Silver"));
        User.admins.add(new User("James", "Platinum"));

        // for(int i = 0; i < User.admins.size(); i++){
        //     System.out.println(userList.get(i).get_name());
        //     System.out.println(userList.get(i).get_membership());
        // }


        


       for (User u : User.admins){
           System.out.println(u.get_name());
           System.out.println(u.get_membership());
           u.verify();
       }
       // System.out.println(user1.get_name());
       // System.out.println(user1.get_membership());
       // System.out.println(user2.get_name());
        // System.out.println(user2.get_membership());
    }
}
