package ua.edu.ucu.apps.task1;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TwitterUser Lida = new TwitterUser("lida@flowerstore.com", TwitterCountry.UKRAINE, LocalDate.of(1806, 04, 16));
        MetaUser Nelida = new MetaUser("nelida@talon.com", "Uzhhorod" , LocalDate.of(2000, 18, 3));
        MyXUser myXUser = new MyXUser(Lida);
        MyMetaUser myMetaUser = new MyMetaUser(Nelida);
        process(myXUser);
        process(myMetaUser);
    }
    public static void process(User user) {
        System.out.println(user.getActiveTime().toString());
        System.out.println(user.getCountry());
        System.out.println(user.getEmail());
    }
}