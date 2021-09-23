import java.util.ArrayList;
import java.util.List;

public class Tenth {
    public static void main(String[] args) {
        int[] num={15,10,0,-6,-5,3,0,-34,0,24,52};

        List<Integer> number= new ArrayList();
        int amount=0;
        for (int i=0;i<num.length;i++){
            if(num[i]==0){

                amount+= 1;

            } else {

                number.add(num[i]);

            }
        }
        for (int i=0;i<amount;i++){
            number.add(0);
        }
        for(int i=0;i<number.size();i++){
            num[i]=number.get(i);
            System.out.print(num[i] + " ");
        }

    }
}
