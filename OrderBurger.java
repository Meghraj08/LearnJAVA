package BurgerKing;

import java.util.Random;

public class OrderBurger extends AbstractBurger {
    static int id = 0;
    private Burger[] burgers, orderBurgers;
    private AddOn[] addOns;
    private int total;

    OrderBurger() {
        addOns=new AddOn[10];
        addOns[1] = new AddOn("Extra Cheese", getRandomPrice(70, 100));
        addOns[2] = new AddOn("Mushrooms", getRandomPrice(70, 100));
        addOns[3] = new AddOn("Black Olives", getRandomPrice(70, 100));
        addOns[4] = new AddOn("Panetta", getRandomPrice(70, 100));
        addOns[5] = new AddOn("Anchovies", getRandomPrice(70, 100));
        addOns[6] = new AddOn("Gorgonzola", getRandomPrice(70, 100));
        addOns[7] = new AddOn("Radicchio", getRandomPrice(70, 100));
        addOns[8] = new AddOn("Capers", getRandomPrice(70, 100));
        addOns[9] = new AddOn("Kale", getRandomPrice(70, 100));
        addOns[0] = new AddOn("Zucchini", getRandomPrice(70, 100));
        burgers = new Burger[5];
        burgers[1] = new Burger("Crispy Chicken", getRandomPrice());
        burgers[1].addAddOns(addOns,2);
        burgers[2] = new Burger("Baked Beamer", getRandomPrice());
        burgers[2].addAddOns(addOns,2);
        burgers[3] = new Burger("Fried Patty", getRandomPrice());
        burgers[3].addAddOns(addOns,2);
        burgers[4] = new Burger("Bingo Burger", getRandomPrice());
        burgers[4].addAddOns(addOns,2);
        burgers[0] = new Burger("Bollywood Fried", getRandomPrice());
        burgers[0].addAddOns(addOns,2);

        System.out.println("-------------------------------------");
        System.out.println(" ORDER DETAILS ");
        System.out.println("-------------------------------------");

        orderBurgers = new Burger[(int) getRandomChoice()];
        for (int i = 0; i < orderBurgers.length; i++) {
            orderBurgers[i] = burgers[getRandomChoice() - 1];
            orderBurgers[i].display();
        }

        generateOrder();

        System.out.println("-------------------------------------");
        System.out.println(" ORDER TOTAL " + this.total);
        System.out.println("-------------------------------------");
    }

    public int getRandomPrice() {
    return (int) Math.abs(Math.random() * 1000 + Math.random() * 300);
    }

    public int getRandomChoice() {
        Random random=new Random();
        return random.nextInt(5)+1;
    }

    void generateOrder() {
        total = 0;
        if (orderBurgers != null) {
            for (Burger b : orderBurgers) {
                b.display();
                total += b.getFinalPrice();
            }
        }
    }

    public static void main(String[] args) {
        OrderBurger orderBurger =new OrderBurger();
    }
}
