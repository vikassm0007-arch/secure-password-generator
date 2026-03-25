import java.util.*;

public class PasswordGenerator {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();

            String lower = "abcdefghijklmnopqrstuvwxyz";
            String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String nums = "0123456789";
            String special = "!@#$%^&*";

            String pool = "";

            System.out.print("Enter length: ");
            int length = sc.nextInt();

            System.out.print("Lowercase? (y/n): ");
            if (sc.next().equalsIgnoreCase("y")) pool += lower;

            System.out.print("Uppercase? (y/n): ");
            if (sc.next().equalsIgnoreCase("y")) pool += upper;

            System.out.print("Numbers? (y/n): ");
            if (sc.next().equalsIgnoreCase("y")) pool += nums;

            System.out.print("Special chars? (y/n): ");
            if (sc.next().equalsIgnoreCase("y")) pool += special;

            if (pool.isEmpty()) {
                System.out.println("No characters selected!");
                return;
            }

            StringBuilder password = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int index = rand.nextInt(pool.length());
                password.append(pool.charAt(index));
            }

            System.out.println("Password: " + password);
        }
    }
}