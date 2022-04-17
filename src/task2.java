import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first, second, third, fourth, fifth;

        System.out.print("Введіть перше слово: ");
        first = sc.nextLine();
        System.out.print("Перша буква: " + first.substring(0,1));
        System.out.println();

        System.out.print("Введіть друге слово: ");
        second = sc.nextLine();
        System.out.print("Перша буква: " + second.substring(0, 1));
        System.out.println();

        System.out.print("Введіть третє слово: ");
        third = sc.nextLine();
        System.out.print("Перша буква: " + third.substring(0, 1));
        System.out.println();

        System.out.print("Введіть четверте слово: ");
        fourth = sc.nextLine();
        System.out.print("Перша буква: " + fourth.substring(0, 1));
        System.out.println();

        System.out.print("Введіть пяте слово: ");
        fifth = sc.nextLine();
        System.out.print("Перша буква: " + fifth.substring(0, 1));
        System.out.println();
    }

}
