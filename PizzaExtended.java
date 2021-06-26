package Inheritance;

class Pizza {
    static int id = 0;
    String name, size;
    double price;
}

class Toppings extends Pizza {
    static int id = 0;
    String name1, name2;
    double price1, price2;

    public void display() {
        System.out.println(" * PIZZA DETAILS * ");
        System.out.println(" Name :- " + this.name);
        System.out.println(" Size :- " + this.size);
        System.out.println(" Price :- " + this.price);
        System.out.println("\n" + " * TOPPINGS DETAILS * ");
        System.out.println(" Name :- " + name1);
        System.out.println(" Price :- " + price1);
        System.out.println(" Name :- " + name2);
        System.out.println(" Price :- " + price2);
    }
}

public class PizzaExtended {
    public static void main(String[] args) {
        Toppings t = new Toppings();
        t.name = "Margareta";
        t.size = "22";
        t.price = 500 + t.price1 + t.price2;
        t.name1 = "Chilli Flakes";
        t.price1 = 30;
        t.name2 = "Extra Cheese";
        t.price2 = 80;
        t.display();
    }
}
