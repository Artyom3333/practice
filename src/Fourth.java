import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num > 0){
            num +=1;
        }
        else if (num < 0){
            num -=2;
        }
        else {
            num = 10;
        }
        System.out.println(num);
    }
}
