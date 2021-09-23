import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        int [] num ={1,-10,5,6,45,23,45,-34,0,32,56,-1,2,-2};
        int max = num[0];   // максимум
        int sum_pos = 0;     // сумма положительных чисел

        int sum_neg_for=0;   // сумма отрицательных чисел для вычисления среднего арифметического
        int chet_sum=0;       //сумма четных отрицательных чисел
        int amount_neg = 0;  //кол-во отрицательных чисел
        int amount_pos=0;    // кол-во положительных
        for (int i=0;i< num.length;i++){
            max = Math.max(max,num[i]);
            if(num[i]>0){
                amount_pos++;
                sum_pos +=num[i];
            }
            if(num[i]<0){
                amount_neg++;
                sum_neg_for+=num[i];
                if(num[i] % 2 == 0){
                    chet_sum +=num[i];
                }

            }
        }
        System.out.println("Максимальное значение:" + max);
        System.out.println("Сумма положительных чисел:" + sum_pos);
        System.out.println("Сумма четных открицательных чисел:" + chet_sum);
        System.out.println("Кол-во положительных элементов:" + amount_pos);
        System.out.println("Среднее арифметическое отрицательных чисел:" + (sum_neg_for/amount_neg));

    }
}
