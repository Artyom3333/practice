public class Ninth {
    public static void main(String[] args) {
        int []num = {15,10,51,6,5,3,10,-34,0,32,56,12,24,52};
        int num2[];
        num2=new int[num.length];
        for (int i=0;i<num.length;i++){
            for(int j=1;j>0;j--){
                num2[i]=num[num.length-1-i];

            }
        }
        for (int i=0; i<num2.length;i++){
            System.out.print(num2[i] + " ");
        }
    }
}
