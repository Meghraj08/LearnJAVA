package Inheritance;

class Patties {
    static int id;
    String name;
    double price;

    Patties() {
        id += 1;
    }

    void display() {
        System.out.println("---------Patties--------------");
        System.out.println("NAME " + name);
        System.out.println("PRICE " + price);
    }
}

class Burger extends Patties {
    static int id;
    String name;
    double price;

    Burger(String name, double price) {
        id += 1;
        this.name = name;
        this.price = price;
    }

    void addPatties(String name, double price) {
        super.name = name;
        super.price = price;
    }

    void display() {
        super.display();
        System.out.println("----------Burger-----------");
        System.out.println("NAME " + name);
        System.out.println("PRICE " + price);
    }
}

public class MacD {
    public static void main(String[] args) {
        Burger burger = new Burger("Mac", 200);
        burger.addPatties("Pop", 20);
        burger.display();
    }
}
