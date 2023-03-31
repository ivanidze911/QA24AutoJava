package QA24AutoJava;

public class Computer {
    public int cost;
    public String name;
    public boolean Keyboard;





    //метод не принимает параметры, и ничего не возвращает значений
    public void printSmth(){
        System.out.println("Я ничего не принимаю, и ничего не возвращаю");
    }
    //метод принимает параметры, но не возвращает значения
    public void printSmth2(String text, int number){
        System.out.println("Я принимаю " + text+ " и число = " + number);
    }
    //метод принимает параметры, и возвращает значение
    public int printSmth3(int number){
        return number+5;
    }
    //метод ничего не принимает но возвращает значение
    public int printSmth4(){
        return 4;
    }

    //метод getter - метод получения
    public int getCost() {
        return cost;
    }
    //метод setter - метод задание значения
    public void setCost(int price) {
        this.cost = price;
    }
    //метод get и set можно создать автоматически.
    //Правая кнопка мыши /Generate... /в меню выбираем создание Getter and Setter (или Alt+Insert)
    public boolean isKeyboard() {
        return Keyboard;
    }

    public void setKeyboard(boolean keyboard) {
        Keyboard = keyboard;
    }
    // создаем конструктор для метода Computer4 из класса Lesson1 без параметров
    public Computer(){
        System.out.println("пустой конструктор");
    }
    // создаем конструктор для метода Computer из класса Lesson1 с параметрами,
    // которые можно заполнять
    // this - используется для получения доступа к полям и конструкторам этого класса
    public Computer(String name, int cost, boolean keyboard){
        this.cost=cost;
        this.Keyboard=keyboard;
        this.name=name;
    }

    // создаем конструктор, который внутри себя будет ссылатся
    // на конструктор этого же класса
    public Computer(int cost, boolean keyboard, String name) {
        // this() - пишется в первую очередь, а потом // this.cost=cost; и т.п.
        this(name, keyboard);
        this.cost=cost;
    }
    public Computer(String name, boolean keyboard){
        this.cost=25000;
        this.Keyboard=keyboard;
        this.name=name;
    }
}
