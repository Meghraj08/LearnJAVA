public class PizzaPractice {
    public static void main(String[] args) {

        Toppings t = new Toppings();
        t.name1 = "Chilli Flakes";
        t.price1 = 30;
        t.name2 = "Extra Cheese";
        t.price2 = 80;
        t.display();

        Pizza p = new Pizza();
        p.name = "Margareta";
        p.size = "22";
        p.price = 500 + t.price1 + t.price2;
        p.display();

    }
}

class Toppings {
    static int id = 0;
    String name1, name2;
    double price1, price2;

    public Toppings() {
    }

    public Toppings(String name1, String name2, double price1, double price2) {
        id += 1;
        this.name1 = name1;
        this.name2 = name2;
        this.price1 = price1;
        this.price2 = price2;
    }

    public void display() {
        System.out.println(" * TOPPINGS DETAILS * ");
        System.out.println(" Name :- " + name1);
        System.out.println(" Price :- " + price1);
        System.out.println(" Name :- " + name2);
        System.out.println(" Price :- " + price2);

    }
}

class Pizza {
    static int id = 0;
    String name, size;
    double price;

    public Pizza() {
    }

    public Pizza(String name, String size, double price) {
        id += 1;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public void display() {
        System.out.println("\n" + " * PIZZA DETAILS * ");
        System.out.println(" Name :- " + name);
        System.out.println(" Size :- " + size);
        System.out.println(" Price :- " + price);
    }
}
