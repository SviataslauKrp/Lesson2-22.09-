import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userName = console.nextLine();
        System.out.println("Hello " + userName);
        console.close();
    }
}