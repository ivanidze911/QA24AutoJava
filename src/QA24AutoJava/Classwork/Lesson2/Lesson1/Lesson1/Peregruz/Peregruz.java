package QA24AutoJava.Classwork.Lesson2.Lesson1.Lesson1.Peregruz;

public class Peregruz {

    int x; //переменную снаружи блока {} видно,
    // y=3; // но снаружи не видно переменную y, кторая находится внутри блока {}

    public void peregruz(){
        int y;
        x=2;
        System.out.println("Я пустой метод");
    }
    public void peregruz(String string){
        System.out.println("Я не пустой метод. У меня строка " + string);
    }
    public void peregruz(String string, int number){
        System.out.println("Я не пустой метод. У меня строка " + string + " и число " + number);
    }
    public void peregruz(String string, int number, String string2){
        peregruz(string2, number);
        System.out.println("И еще есть строка " + string);
    }

}
