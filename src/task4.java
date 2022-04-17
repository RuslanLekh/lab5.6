import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        String first, second;
        Scanner sc = new Scanner(System.in);

        System.out.print("Перше слово: ");
        first = sc.nextLine();

        System.out.print("Друге слово: ");
        second = sc.nextLine();

        System.out.println(first.equalsIgnoreCase(second));
    }
}
