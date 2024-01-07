import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) {
        System.out.println("Version 10 new");
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }

        list.stream().forEach(a -> 
                                    System.out.println(a));

        scanner.close();
    }
}