import java.util.*;
public class Program {
    public static void main(String[] args) {
        //UC3
    Set<String> bogies=new HashSet<>();
    bogies.add("BG101");
    bogies.add("BG102");
    bogies.add("BG103");
    bogies.add("BG104");
    //Duplicates will be ignored
    bogies.add("BG101");
    bogies.add("BG102");
    System.out.println(bogies);
    System.out.println("duplicates are automatically ignored by hashset");
    System.out.println("UC3 uniqueness validation completed");
    }
}
