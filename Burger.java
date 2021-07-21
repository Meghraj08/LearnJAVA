package BurgerKing;

import java.util.Random;

public class Burger extends AbstractBurger {
    static int id = 0;
    private AddOn[] addOns;
    private int FinalPrice = 0;

    public Burger(String name, int price) {
        id += 1;
        this.name = name;
        this.price = this.gstGSTPrice(price);
        this.FinalPrice += this.price;
    }

    public int getFinalPrice() {
        return FinalPrice;
    }

    void addAddOns(AddOn[] addOns, int addOnsNum) {
        if (addOnsNum <= 3) {
            this.addOns = new AddOn[addOnsNum];
            for (int i = 0; i < this.addOns.length; i++) {
                this.addOns[i] = addOns[getRandomChoice() - 1];
            }
        }
    }

    public int getRandomChoice() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public void display() {
        System.out.println("-------------------------------------");
        System.out.println(" BURGER DETAILS ");
        System.out.println("-------------------------------------");
        super.display();

        double sum = 0;
        if (addOns != null) {
            for (AddOn a : addOns) {
                a.display();
                sum += a.price;
            }
            FinalPrice += sum;
        }
        System.out.println("-------------------------------------");
        System.out.println(" BURGER FINAL PRICE " + FinalPrice);
        System.out.println("-------------------------------------");
    }
}