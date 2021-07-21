package BurgerKing;

public class AddOn extends AbstractBurger {
    static int id = 0;

    public AddOn(String name, int price) {
        id += 1;
        this.name = name;
        this.price = this.gstGSTPrice(price);
    }

    public void display() {
        System.out.println(" ADDONS ");
        System.out.println("-------------------------------------");
        super.display();
    }
}
