package lecture3.programm2;

public abstract class Car {
    String stamp;
    String class_auto;
    String weight;
    Engine motor;


    abstract void start();
    abstract void stop();
    abstract void printInfo();
    String turnRight(){
        return "Поворот направо";
    }
    String turnLeft(){
        return "Поворот налево";
    }
}
class Lorry extends Car{
    double load_capacity;
    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    void printInfo() {

    }
}
class SportCar extends Car {
    double speed;

    @Override
    void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    void stop() {
        System.out.println("SportCar остановился");

    }

    @Override
    void printInfo() {

    }
}


