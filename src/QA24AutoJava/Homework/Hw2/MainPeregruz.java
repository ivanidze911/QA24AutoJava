package QA24AutoJava.Homework.Hw1;

public class MainPeregruz {
    public static void main(String[] args) {
        PeregruzMethod Mperegruz = new PeregruzMethod();
        Mperegruz.printAMessage();
        Mperegruz.printAMessage("string");
        String[] strings = new String[5];
        Mperegruz.printAMessage(strings);
        int[] arr = new int[3];
        Mperegruz.printAMessage(arr);
        Mperegruz.printAMessage(1, "Шарик, ты балбес");


    }
}
