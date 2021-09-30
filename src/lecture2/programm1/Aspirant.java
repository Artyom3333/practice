package lecture2.programm1;

public class Aspirant extends Student{
    String sci_work="JAVA LAnguage";
    public Aspirant(String firstName, String lastName, String group, double averageMArk, String sci_work) {
        super(firstName, lastName, group, averageMArk);
        this.sci_work = sci_work;
    }
    Aspirant(){
        super();
    }

    public int getScholarship(){
        int summ=0;
        if (averageMark==5){
            summ =200;
        } else{
            summ = 180;
        }
        return summ;
    }
}
