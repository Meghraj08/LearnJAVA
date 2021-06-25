class Topping {
    static int id;
    String name;
    int qty;
    double price, gstPrice, gst = 0.18;

    Topping() {
        id += 1;
    }

    public Topping(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.gstPrice = this.price * this.gst;
    }

    public void display() {
        System.out.println("---------------------------------");
        System.out.println(" * TOPPING ORDERS * ");
        System.out.println(" Name :- " + this.name);
        System.out.println(" Quantity :- " + this.qty);
        System.out.println(" Price :- " + this.price);
        System.out.println(" Gst :- " + this.gstPrice);
        System.out.println("---------------------------------");
    }

    public void displayTable() {
        System.out.println("---------------------------------");
        System.out.println(" * TOPPING ORDERS * ");
        System.out.println(" Name :- " + " Quantity :- " + " Price :- " + " Gst :- ");
        System.out.println(this.name + this.qty + this.price + this.gstPrice);
        System.out.println("---------------------------------");
    }
}

class AddOn {
    static int id;
    String name;
    int qty;
    double price, gstPrice, gst = 0.18;

    AddOn() {
        id += 1;
    }

    public AddOn(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.gstPrice = this.price * this.gst;
    }

    public void display() {
        System.out.println("---------------------------------");
        System.out.println(" * ADDON ORDERS * ");
        System.out.println(" Name :- " + this.name);
        System.out.println(" Quantity :- " + this.qty);
        System.out.println(" Price :- " + this.price);
        System.out.println(" Gst :- " + this.gstPrice);
        System.out.println("---------------------------------");
    }

    public void displayTable() {
        System.out.println("---------------------------------");
        System.out.println(" * ADDON ORDERS * ");
        System.out.println(" Name :- " + " Quantity :- " + " Price :- " + " Gst :- ");
        System.out.println(this.name + this.qty + this.price + this.gstPrice);
        System.out.println("---------------------------------");
    }
}

class Shakes {
    static int id;
    String name;
    int qty;
    double size, price, gstPrice, gst = 0.18, finalAmount = 0;
    AddOn addOn1, addOn2;

    Shakes() {
        id += 1;
    }

    public Shakes(String name, int qty, double price, double size) {
        this.name = name;
        this.qty = qty;
        this.size = size;
        this.price = price;
        this.gstPrice = this.price * this.gst;
    }

    public Shakes(String name, int qty, double price, double size, AddOn addOn1) {
        this(name, qty, price, size);
        this.addOn1 = addOn1;
    }

    public Shakes(String name, int qty, double price, double size, AddOn addOn1, AddOn addOn2) {
        this(name, qty, price, size, addOn1);
        this.addOn2 = addOn2;
    }

    public void calculatePrice() {
        if (this.addOn1 != null && this.addOn2 != null) {
            this.finalAmount = (this.price + this.gstPrice) * this.qty + (this.addOn1.price + this.addOn1.gstPrice) * this.addOn1.qty + (this.addOn2.price + this.addOn2.gstPrice) * this.addOn2.qty;
        } else if (this.addOn1 != null) {
            this.finalAmount = (this.price + this.gstPrice) * this.qty + (this.addOn1.price + this.addOn1.gstPrice) * this.addOn1.qty;
        } else {
            this.finalAmount = (this.price + this.gstPrice) * this.qty;
        }
    }

    public void display() {
        System.out.println("---------------------------------");
        System.out.println(" * SHAKE ORDERS * ");
        System.out.println(" Name :- " + this.name);
        System.out.println(" Size :- " + this.size);
        System.out.println(" Quantity :- " + this.qty);
        System.out.println(" Price :- " + this.price);
        System.out.println(" Gst :- " + this.gstPrice);
        System.out.println("---------------------------------");

        if (this.addOn1 != null) {
            this.addOn1.display();
        }
        if (this.addOn2 != null) {
            this.addOn2.display();
        }
    }

    public void displayTable() {
        System.out.println("---------------------------------");
        System.out.println(" * SHAKE ORDERS * ");
        System.out.println("Name " + "\t   " + " Size " + "\t" + " Quantity " + "\t" + " Price " + "\t" + " Gst ");
        System.out.println(this.name + "\t" + this.size + "\t " + this.qty + "\t         " + this.price + "\t " + this.gstPrice);
        System.out.println("---------------------------------");

    }
}

class Sandwich {
    static int id;
    String name;
    int qty;
    double size, price, gstPrice, gst = 0.18, finalAmount = 0;
    Topping topping1, topping2;

    Sandwich() {
        id += 1;
    }

    public Sandwich(String name, int qty, double price, double size) {
        this.name = name;
        this.qty = qty;
        this.size = size;
        this.price = price;
        this.gstPrice = this.price * this.gst;
    }

    public Sandwich(String name, int qty, double price, double size, Topping topping1) {
        this(name, qty, price, size);
        this.topping1 = topping1;
    }

    public Sandwich(String name, int qty, double price, double size, Topping topping1, Topping topping2) {
        this(name, qty, price, size, topping1);
        this.topping2 = topping2;
    }

    public void calculatePrice() {
        if (this.topping1 != null && this.topping2 != null) {
            this.finalAmount = (this.price + this.gstPrice) * this.qty + (this.topping1.price + this.topping1.gstPrice) * this.topping1.qty + (this.topping2.price + this.topping2.gstPrice) * this.topping2.qty;
        } else if (this.topping1 != null) {
            this.finalAmount = (this.price + this.gstPrice) * this.qty + (this.topping1.price + this.topping1.gstPrice) * this.topping1.qty;
        } else {
            this.finalAmount = (this.price + this.gstPrice) * this.qty;
        }
    }

    public void display() {
        System.out.println("---------------------------------");
        System.out.println(" * SANDWICH ORDERS * ");
        System.out.println(" Name :- " + this.name);
        System.out.println(" Size :- " + this.size);
        System.out.println(" Quantity :- " + this.qty);
        System.out.println(" Price :- " + this.price);
        System.out.println(" Gst :- " + this.gstPrice);
        System.out.println(" Final :- " + this.finalAmount);
        System.out.println("---------------------------------");

        if (this.topping1 != null) {
            this.topping1.display();
        }
        if (this.topping2 != null) {
            this.topping2.display();
        }
    }

    public void displayTable() {
        System.out.println("---------------------------------");
        System.out.println(" * SANDWICH ORDERS * ");
        System.out.println("Name " + "\t        " + " Size " + "\t" + " Quantity " + "\t" + " Price " + "\t" + " Gst " + "\t" + " Final ");
        System.out.println(this.name + "\t " + this.size + "\t " + this.qty + "\t         " + this.price + "\t " + this.gstPrice + "\t " + this.finalAmount);
        System.out.println("---------------------------------");
    }
}

class Orders {
    Sandwich sandwich1, sandwich2;
    Shakes shakes1, shakes2;
    Topping topping1,topping2;
    AddOn addOn1,addOn2;
    double orderValue;

    Orders(Sandwich sandwich1) {
        this.sandwich1 = sandwich1;
        this.sandwich1.calculatePrice();
        this.orderValue = this.sandwich1.finalAmount;
    }

    Orders(Sandwich sandwich1, Sandwich sandwich2) {
        this.sandwich1 = sandwich1;
        this.sandwich2 = sandwich2;
        this.sandwich1.calculatePrice();
        this.sandwich2.calculatePrice();
        this.orderValue = this.sandwich1.finalAmount + this.sandwich2.finalAmount;
    }

    Orders(Shakes shakes1) {
        this.shakes1 = shakes1;
        this.shakes1.calculatePrice();
        this.orderValue = this.shakes1.finalAmount;
    }

    Orders(Shakes shakes1, Shakes shakes2) {
        this.shakes1 = shakes1;
        this.shakes2 = shakes2;
        this.shakes1.calculatePrice();
        this.shakes2.calculatePrice();
        this.orderValue = this.shakes1.finalAmount + this.shakes2.finalAmount;
    }

    public void displayTable() {
        if (this.sandwich1 != null) this.sandwich1.displayTable();
        if (this.sandwich2 != null) this.sandwich2.displayTable();
        if (this.topping1 != null) this.topping1.displayTable();
        if (this.topping2 != null) this.topping2.displayTable();
        if (this.shakes1 != null) this.shakes1.displayTable();
        if (this.shakes2 != null) this.shakes2.displayTable();
        if (this.addOn1 != null) this.addOn1.displayTable();
        if (this.addOn2 != null) this.addOn2.displayTable();

        System.out.println(" ORDER VALUE = " + this.orderValue);
    }
}

public class HotelMeal {
    public static void main(String[] args) {
        Topping topping1 = new Topping("Cheese", 1, 100);
        Topping topping2 = new Topping("Chilli Flakes", 1, 60);
        Sandwich sandwich1 = new Sandwich("Grill Sandwich", 1, 500, 22, topping1);
        Sandwich sandwich2 = new Sandwich("Jumbo Sandwich", 1, 1000, 35, topping1, topping2);

        AddOn addOn1 = new AddOn("Chocolate", 1, 80);
        AddOn addOn2 = new AddOn("Ice Cream", 1, 150);
        Shakes shakes1 = new Shakes("Chocolate Shake", 1, 200, 10, addOn1);
        Shakes shakes2 = new Shakes("Oreo Shake", 1, 350, 35, addOn1, addOn2);

        Orders orders1 = new Orders(sandwich2);
        orders1.displayTable();
        Orders orders2 = new Orders(shakes2);
        orders2.displayTable();
    }
}
