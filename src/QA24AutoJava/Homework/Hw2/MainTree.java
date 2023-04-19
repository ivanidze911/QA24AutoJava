package QA24AutoJava.Homework.Hw1;

public class MainTree {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.getInfo();
        System.out.println("==================================================");
        Tree tree2 = new Tree("Дуб");
        tree2.getInfo();
        System.out.println("==================================================");
        Tree tree3 = new Tree("Ясень", 150 );
        tree3.getInfo();
        System.out.println("==================================================");
        Tree tree4 = new Tree(50, 360, "Синий");
        tree4.getInfo();
        System.out.println("==================================================");

        }





}
