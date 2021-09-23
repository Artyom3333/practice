import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число1: ");
        int num = in.nextInt();

        System.out.print("Введите число2: ");
        int num2 = in.nextInt();

        System.out.print("Введите число3: ");
        int num3 = in.nextInt();
        int min = num;
        if (num2 < min){
            min =num2;
        }
        if (num3 < min){
            min = num3;
        }

        System.out.println(min);
    }
}
