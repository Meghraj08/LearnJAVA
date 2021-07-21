package BurgerKing;

public class Customer {
    static int id = 0;
    String name;
    OrderBurger[] orderBurgers;

    Customer(String name) {
        this.name = name;
    }

    void addOrder(int order) {
        orderBurgers = new OrderBurger[order];
        for (int i = 0; i < order; i++) {
            orderBurgers[i] = new OrderBurger();
        }
    }
}
