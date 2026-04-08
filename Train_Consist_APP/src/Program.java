import java.util.*;
public class Program {
    public static void main(String[] args) {
        System.out.println("UC4");
        List<String> trainConsist = new LinkedList<>();
        trainConsist.addFirst("Engine");
        trainConsist.addLast("Guard");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        System.out.println("initial train consist : \n"+trainConsist);
        trainConsist.add(2,"Pantry");
        System.out.println("After adding Pantry at index 2 : \n"+trainConsist);
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removing First and last bogie : \n"+trainConsist);
        System.out.println("UC4 implemented");
    }
}
