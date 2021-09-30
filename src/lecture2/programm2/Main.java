package lecture2.programm2;

public class Main {
    public static void main(String[] args) {
        Doctor d1= new Doctor();
        Animal []animals = new Animal[3];
        animals[0] = new Dog("meat", "near home");
        animals[1] = new Cat("milk", "home");
        animals[2] = new Horse("grass", "stable");
        for (int i=0;i< animals.length;i++){
            d1.treatAnimal(animals[i]);
        }
    }
}
