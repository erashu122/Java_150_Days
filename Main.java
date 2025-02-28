
class Variable {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Variable obj1 = new Variable();
        obj1.brand = "Apple";
        obj1.price = 1000;
        obj1.name = "iPhone";

        Variable obj2 = new Variable();
        obj2.brand = "Samsung";
        obj2.price = 800;
        obj2.name = "Galaxy";

        obj1.show();
        obj2.show();
    }
}