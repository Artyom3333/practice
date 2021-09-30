package lecture2.programm2;

public class Animal {
    String food= "food", location="location";
     Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    void makeNoise(){
        System.out.println("Animal make noise");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is slepiing");
    }
}

class Dog extends Animal{
    String leash="1 meter";

    Dog(String food, String location) {
        super(food, location);
    }

    void makeNoise(){
        System.out.println("Dog make noise");
    }
    void eat(){
        System.out.println("Dog eat");
    }
}
class Cat extends Animal{
    String cat_voice ="Mew";

    Cat(String food, String location) {
        super(food, location);
    }

    void makeNoise(){
        System.out.println("Cat make noise");
    }
    void eat(){
        System.out.println("Cat eat");
    }
}
class Horse extends Animal{
    String mane_color = "Grey";

    Horse(String food, String location) {
        super(food, location);
    }

    void makeNoise(){
        System.out.println("Horse make noise");
    }
    void eat(){
        System.out.println("Horse eat");
    }
}