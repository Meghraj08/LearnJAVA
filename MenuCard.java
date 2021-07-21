package String;

public class MenuCard {
    static int counter = 0;
    int id;
    String name;
    int price;

    MenuCard() {
        counter += 1;
        id = counter;
    }

    private String repeat(char c, int num) {
        String r = "";
        for (int i = 0; i < num; i++) {
            r = r.concat(String.valueOf(c));
        }
        return r;
    }

    @Override
    public String toString() {
        int sample = String.format("| %-10s | %15d |\n", "ID :-", id).length();
        String card = "";
        card += repeat('-', sample - 1);
        card += String.format("\n| %-10s | %15d |\n", "ID :-", id);
        card += String.format("| %-10s | %15s |\n", "NAME :-", name);
        card += String.format("| %-10s | %15s |\n", "PRICE :-", price);
        card += repeat('-', sample - 1);
        return card;
    }

    public static void main(String[] args) {
        MenuCard[] menuCard = new MenuCard[5];
        for (int i = 0; i < menuCard.length; i++) {
            menuCard[i] = new MenuCard();
        }
        menuCard[0].name = "Crispy Chicken";
        menuCard[0].price = 450;
        System.out.println(menuCard[0]);

        menuCard[1].name = "Baked Beamer";
        menuCard[1].price = 500;
        System.out.println(menuCard[1]);

        menuCard[2].name = "Fried Patty";
        menuCard[2].price = 600;
        System.out.println(menuCard[2]);

        menuCard[3].name = "Bingo Burger";
        menuCard[3].price = 620;
        System.out.println(menuCard[3]);

        menuCard[4].name = "Bollywood Fried";
        menuCard[4].price = 750;
        System.out.println(menuCard[4]);
    }
}
