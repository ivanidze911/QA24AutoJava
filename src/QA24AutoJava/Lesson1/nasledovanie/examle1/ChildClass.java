package QA24AutoJava.Lesson1.nasledovanie.examle1;

public class ChildClass extends ParentClass{
    // extends - значит что мы наслудуемся от класса ParentClass,
    // при этоммы получаем доступ ко всем полям и методам ParentClass
    String childString;

    public ChildClass(String parentString, int parentInt) {
        super(parentString, parentInt); //super - указывает на использование родительского конструктора
    }


    public void setChildString(){
        System.out.println("child method");
        super.parentMethods(); //используя super - получаем доступ к полям родительского класса
        System.out.println(super.parentInt);

    }


}
