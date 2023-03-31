package QA24AutoJava.Peregruz;

public class PeregruzMain {
    public static void main(String[] args) {
        Peregruz peregruzka = new Peregruz();
        //вводим пораметры в круглых скобках, метод подбирается автоматически из тех вариантов,
        // что мы создали в Java Class.Peregruz
        peregruzka.peregruz();
        peregruzka.peregruz("string");
        peregruzka.peregruz("string",4);
        peregruzka.peregruz("string",4, "string2");
    }

}
