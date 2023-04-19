package QA24AutoJava.Homework.Hw1;

import java.util.Scanner;

public class PeregruzMethod {
    //2) Написать перегруженный метод, который может:
    //  - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
    //  - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
    //  - Принимать в качестве параметров массив строк,
    //    тогда он будет выводить на консоль все его значения через пробел.
    //  - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
    //    массива.
    //  - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
    //    "Ваше сообщение - "%%%%%%%%", ваше число -  $",
    //    где "%%%%%%%%" и $ ваши введенные строка и число соответственно.

    public void printAMessage() {
        System.out.println("Я не принимаю никаких значений");
    }
    public void printAMessage(String string) {
        System.out.println("Я не пустой метод. У меня есть строка " + string);
    }
    public void printAMessage(String[] str) {
        Scanner sc_str = new Scanner(System.in); //Ввести с клавиатуры строку текста с помощью сканера
        // текст "Ученые научились генерировать новые нейроны в мозге"
        System.out.println("Введите первую строку маассива ");
        String string1 = sc_str.nextLine();
        System.out.println("Введите вторую строку маассива ");
        String string2 = sc_str.nextLine();
        System.out.println("Введите третью строку маассива ");
        String string3 = sc_str.nextLine();
        System.out.println("Введите четвертую строку маассива ");
        String string4 = sc_str.nextLine();
        System.out.println("Введите пятую строку маассива ");
        String string5 = sc_str.nextLine();
        System.out.println("Я не пустой метод. У меня есть массив строк {" + string1 +" "+ string2 +" "+ string3 +" "+ string4 +" "+ string5 +'}');
    }
    public void printAMessage(int[] arr){
        //запонение массива с помощью сканнера
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите "+ (i + 1) +" число ");
            arr[i] = sc.nextInt();
            //сумма элементов массива
            sum = sum + arr[i];
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
    public void printAMessage(int nam, String string) {
        System.out.println("Ваше число = " + nam + ", Ваше сообщение - " + string);

    }






}
