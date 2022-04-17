import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first, second, third, fourth, fifth;

        System.out.print("Введіть перше слово: ");
        first = sc.nextLine();

        System.out.print("Введіть друге слово: ");
        second = first.concat((" ") + sc.nextLine());

        System.out.print("Введіть третє слово: ");
        third = second.concat( (" ") + sc.nextLine());

        System.out.print("Введіть четверте слово: ");
        fourth = third.concat((" ") + sc.nextLine());

        System.out.print("Введіть пяте слово: ");
        fifth = fourth.concat((" ") + sc.nextLine());

        System.out.print("Ваше речення: " + fifth + ".");

    }
}
