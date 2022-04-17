import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        double first, second,  third;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть перше число : ");
        first = sc.nextDouble();
        System.out.println();

        System.out.print("Введіть друге число: ");
        second = sc.nextDouble();
        System.out.println();

        System.out.print("Введіть третє число: ");
        third = sc.nextDouble();
        System.out.println();

        if (first > second && first > third) {
            System.out.println("Перше число найбільше!");
        }else if(second > first && second > third) {
            System.out.println("Друге число найбільше!");
        }else if (third > first && third > second){
            System.out.println("Третє число найбільше!");
        }else{
            System.out.println("Введено рівні числа");
        }
    }
}
