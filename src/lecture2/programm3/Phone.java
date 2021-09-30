package lecture2.programm3;

public  class Phone{
    String number="+79251857965";
    String model="Samsung";
    int weight=115;
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(String number, String model, int weight){
        this(number,model);
        this.weight = weight;
    }
    void receiveCall(String name){
        System.out.println("Звонит  " + name);
    }
    void receiveCall(String name, String number){
        System.out.println("Звонит " + name + " с номером " + number);
    }
    String getNumber(){
        return number;
    }
    void sendMessage(String...numbers ){
        for(String i : numbers) {
            System.out.println(i);
        }
    }
    Phone(){}
}
