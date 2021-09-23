import java.util.Scanner;

public class First{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int a = num % 10;
        System.out.println(a);
    }
}