import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i=0; i<3; i++) {
            System.out.printf("Enter your USERNAME: ");
            Scanner scanner = new Scanner(System.in);
            String username = scanner.nextLine();

            System.out.printf("Enter your PASSWORD: ");
            Scanner scanner1 = new Scanner(System.in);
            String password = scanner.nextLine();

            if (username.equals("admin") && password.equals("12345678")) {
                System.out.printf("LOGIN SUCCESS");
                break;
            } else {
                if (i==2) {
                    System.out.println("LOGIN FAILED");
                }
                else{
                    System.out.println("Try again");
                }
            }

        }
    }
}