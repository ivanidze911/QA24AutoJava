package QA24AutoJava.nasledovanie.examle1;

public class ParentClass {
    String parentString;
    int parentInt;

    public ParentClass(String parentString, int parentInt) {
        this.parentString = parentString;
        this.parentInt = parentInt;
    }
    //public ParentClass(){}

    public void parentMethods(){
        System.out.println("I am parent methods");
    }

}
