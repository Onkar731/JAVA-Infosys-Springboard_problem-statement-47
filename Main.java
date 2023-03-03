import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int number = sc.nextInt();

        // printing new number
        System.out.println(RemoveEven.removeEven(number));

        // closing resource
        sc.close();
    }
}