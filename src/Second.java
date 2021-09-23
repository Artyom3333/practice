import java.util.Scanner;
import java.io.*;
public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int sum=0;
        int temp=0;
        for (int i=0;i<3;i++){
            temp = num % 10;
            num /=  10;
            sum += temp;
        }
        System.out.println("Сумма:" + sum);
    }


}
