package lecture2.programm3;

public class Main {


    public static void main(String[] args) {
        Phone []phon = new Phone[3];
         phon[0]=new Phone();
         phon[1]=new Phone("+702574985","Xiaomi");
         phon[2]=new Phone("+72864522555","HTC", 111);
        for(Phone i : phon ){
            System.out.println(i.number + " " + i.model + " " + i.weight);
            i.receiveCall("Victor");
            i.receiveCall("Dmitriy","+955554554557");
            System.out.println(i.getNumber());
            i.sendMessage("+7954555","+494848488","+594449", "+44848");
            System.out.println();
        }
    }
}
