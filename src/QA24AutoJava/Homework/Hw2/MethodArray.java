package QA24AutoJava.Homework.Hw1;

public class MethodArray {
    public void printArrPol() {
        int[] arr1 = new int[20];
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println( i + " ");
            }
        }
    }public void printArrNeg() {
        int[] arr2 = new int[20];
        for (int j = 1; j < 20; j++) {
            if (j % 2 != 0) {
                System.out.println( j + " ");
            }
        }
    }
}