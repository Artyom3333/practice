package lecture2.programm1;

public class Student {
    String firstName, lastName, group;
    double averageMark;
    public Student(String firstName,String lastName,String group,double averageMArk){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMArk;
     }
     public Student(){
         this.firstName = "Ivan";
         this.lastName = "Ivanov";
         this.group = "BVT";
         this.averageMark = 4;
     }
    public int getScholarship(){
        int summ=0;
        if (averageMark==5){
            summ =100;
        } else{
            summ = 80;
        }
        return summ;
    }

}
