import java.util.*;
public class Program {
    public static void main(String[] args) {
        List<String> PassengerBoogies=new ArrayList<>();
        PassengerBoogies.add("Sleeper");
        PassengerBoogies.add("AC Chair");
        PassengerBoogies.add("First Class");
        System.out.println(PassengerBoogies);
        PassengerBoogies.remove("AC Chair");
        System.out.println(PassengerBoogies);
        System.out.println(PassengerBoogies.contains("Sleeper"));
        System.out.println("Final Passenger train list : \n" +PassengerBoogies);
    }
}
