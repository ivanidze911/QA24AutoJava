package QA24AutoJava.Classwork.Lesson1.workClass;

import QA24AutoJava.Classwork.Lesson1.workClass.MainComputer.dostupModifier.Computer;

public class MainComputer {
    public static void main(String[] args) {
//        Computer computer = new Computer();
//        System.out.println(computer.Keyboard);
//        System.out.println(computer.cost);
//        System.out.println(computer.name);
//        computer.Keyboard = true;
//        computer.cost = 20000;
//        computer.name = "ASUS";
//        System.out.println(computer.Keyboard);
//        System.out.println(computer.cost);
//        System.out.println(computer.name);


        //методы смотри class Computer.java
        //метод не принимает параметры, и ничего не возвращает значений
        Computer computer2 = new Computer("Apple", 50000, true);
        Computer computer4 = new Computer("dell", true);

        System.out.println(computer4.getCost());
        computer2.printSmth();
        //метод принимает параметры, но не возвращает значения
        computer2.printSmth2("Text", 50);
        //метод принимает параметры, и возвращает значение
        System.out.println(computer2.printSmth3(10)+2);
        //метод ничего не принимает но возвращает значение
        System.out.println(computer2.printSmth4());

        //метод getter - метод получения
        System.out.println(computer2.getCost());
        //метод setter - метод задание значения
        computer2.setCost(20000);
        System.out.println(computer2.getCost());



    }
}
