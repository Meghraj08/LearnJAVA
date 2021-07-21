package BurgerKing;

import java.util.Random;

public class AbstractBurger {
    String name;
    int price;

    public int gstGSTPrice(int price) {
        return (int) (price + price * 0.18);
    }

    public int getRandomPrice(int low, int high) {
        Random random = new Random();
        int num = random.nextInt(high) + 1;
        while (!(num < high && num > low)) {
            num = random.nextInt(high) + 1;
        }
        return num;
    }

    public void display() {
        System.out.println(" NAME :- " + name);
        System.out.println(" PRICE :- " + price);
        System.out.println("-------------------------------------");
    }
}
