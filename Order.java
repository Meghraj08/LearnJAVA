package Collection;

import java.util.ArrayList;

class Item {
    int id;
    double price;

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id + ", price=" + price + "\n";
    }
}


class Toppings extends Item {
    static int counter = 0;

    public Toppings(double price) {
        counter++;
        this.id = counter;
        this.price = price;
    }
}

class Pizza extends Item {
    static int counter = 0;
    ArrayList<Toppings> toppings;

    public Pizza(double price) {
        counter++;
        this.id = counter;
        this.price = price;
        this.toppings = new ArrayList<>();
    }

    public void addToppings(Toppings tp) {
        toppings.add(tp);
    }

    @Override
    public String toString() {
        return "Pizza{" + super.toString() + ", toppings=" + toppings + '}';
    }
}

public class Order {
    public static void main(String[] args) {
        Toppings toppings = new Toppings(10);
        Toppings toppings1 = new Toppings(25);

        Pizza pizza = new Pizza(1500);
        pizza.addToppings(toppings);
        pizza.addToppings(toppings1);

        System.out.println(pizza);
    }
}
