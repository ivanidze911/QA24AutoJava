package QA24AutoJava.Homework.Hw1;

public class MainMethodArray {
    //1) Написать метод, принимающий в качестве параметра массив целых чисел.
    // И выводит на экран все четные числа списком, а также нечетные числа списком.
    public static void main(String[] args) {
        MethodArray arrayPol = new MethodArray();
        MethodArray arrayNeg = new MethodArray();
        System.out.println("Четные числа массива");
        arrayPol.printArrPol();
        System.out.println("Нечетные числа массива");
        arrayNeg.printArrNeg();
    }
}
