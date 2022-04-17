import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        String first, second;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть перший рядок: ");
        first = sc.nextLine();

        System.out.print("Введіть другий рядок: ");
        second = sc.nextLine();

        if (first.length() > second.length() ) {
            System.out.println("Перший рядок більший! ");

        }else if (first.length() < second.length()) {
            System.out.println("Другий рядок більший!");

        }else {
            System.out.println("Рядки рівні!");
        }
    }
}
