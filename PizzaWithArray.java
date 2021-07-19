package PizzaArray;

class Pizza {
    static int id = 0;
    String name;
    int size;
    double price;

    Pizza(String name, int size, double price) {
        id += 1;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    void display() {
        System.out.println("\n" + "* PIZZA DETAILS *");
        System.out.println(" ID :- " + id);
        System.out.println(" NAME :- " + this.name);
        System.out.println(" SIZE :- " + this.size);
        System.out.println(" PRICE :- " + this.price);
    }
}

class Toppings {
    static int id = 0;
    String name;
    int qty;
    double price;

    Toppings(String name, int qty, double price) {
        id += 1;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    void display() {
        System.out.println("\n" + "* TOPPING DETAILS *");
        System.out.println(" ID :- " + id);
        System.out.println(" NAME :- " + this.name);
        System.out.println(" QUANTITY :- " + this.qty);
        System.out.println(" PRICE :- " + this.price);
    }
}

class ColdDrinks {
    static int id = 0;
    String name;
    int qty;
    double price;

    ColdDrinks(String name, int qty, double price) {
        id += 1;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    void display() {
        System.out.println("\n" + "* COLD DRINK DETAILS *");
        System.out.println(" ID :- " + id);
        System.out.println(" NAME :- " + this.name);
        System.out.println(" QUANTITY :- " + this.qty);
        System.out.println(" PRICE :- " + this.price);
    }
}

public class PizzaWithArray {
    public static void main(String[] args) {
        Pizza[] st = new Pizza[1];
        for (int i = 0; i < st.length; i++) {
            st[i] = new Pizza("Simple Pizza", 24, 1000);
            st[i].display();
        }
        for (int i = 0; i < st.length; i++) {
            st[i] = new Pizza("Double Cheese", 12, 800);
            st[i].display();
        }
        Toppings[] ob = new Toppings[1];
        for (int i = 0; i < ob.length; i++) {
            ob[i] = new Toppings("Chilli Flakes", 2, 100);
            ob[i].display();
        }
        for (int i = 0; i < ob.length; i++) {
            ob[i] = new Toppings("Oregano", 1, 40);
            ob[i].display();
        }
        ColdDrinks[] mn = new ColdDrinks[1];
        for (int i = 0; i < ob.length; i++) {
            mn[i] = new ColdDrinks("Pepsi", 2, 150);
            mn[i].display();
        }
        for (int i = 0; i < ob.length; i++) {
            mn[i] = new ColdDrinks("Mountain Deu", 1, 80);
            mn[i].display();
        }
    }
}
