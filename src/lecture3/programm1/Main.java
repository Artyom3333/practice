package lecture3.programm1;

public class Main {
    static String priceCountBouquet(Flower ... bouquet){
        double sum=0;
        int count=0;
        for(Flower bouq:bouquet){
            sum=sum+bouq.getPrice();
        }
        return "Стоимость проданного букета: "+ sum +" Количество проданных цветов: "+ bouquet.length;
    }
    public static void main(String[] args) {
        Rose rose=new Rose();
        Tulip tulip=new Tulip();
        Tulip tulip_1=new Tulip();
        Buttercups buttercups= new Buttercups();
        Сarnations carnations= new Сarnations();
        Flower[] bouquet_1= {tulip,carnations,rose};
        Flower[] bouquet_2= {tulip,tulip_1,rose,buttercups};
        Flower[] bouquet_3= {carnations,rose,buttercups};
        System.out.println(priceCountBouquet(bouquet_3));


    }
}
