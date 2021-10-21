package lecture3.programm1;

public class Flower {
    double price;
    double getPrice(){
        return price;
    }
}
class Rose extends Flower {
    double price=150;

    @Override
    public double getPrice() {
        return price;
    }
}

 class Buttercups extends Flower {
    double price=140.5;

    @Override
    public double getPrice() {
        return price;
    }
}
 class Tulip extends Flower{
    double price=120.3;

    @Override
    public double getPrice() {
        return price;
    }
}
 class Сarnations extends Flower{
    double price=148.4;

    @Override
    public double getPrice() {
        return price;
    }
}
