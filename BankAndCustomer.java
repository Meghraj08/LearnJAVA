package Inheritance;

class bankB {
    static int id = 0;
    String name, mn, address;

    bankB() {
        id += 1;
    }

    void display() {
        System.out.println(" * BANK DETAILS * ");
        System.out.println(" Name :- " + name);
        System.out.println(" Mobile Number :- " + mn);
        System.out.println(" Address :- " + address);
    }
}

class customerC extends bankB {
    static int id = 0;
    String name, gender, branch;

    customerC(String name, String gender, String branch) {
        id += 1;
        this.name = name;
        this.gender = gender;
        this.branch = branch;
    }

    void addbankB(String name, String mn, String address) {
        super.name = name;
        this.mn = mn;
        this.address = address;
    }

    void display() {
        super.display();
        System.out.println("\n" + "* CUSTOMER DETAILS * ");
        System.out.println(" Name :- " + name);
        System.out.println(" Gender :- " + gender);
        System.out.println(" Branch :- " + branch);
    }
}

public class BankAndCustomer {
    public static void main(String[] args) {
        customerC c = new customerC("Meghraj Mahida", "Male", "Vesu");
        c.addbankB("ICICI Bank", "0261-226679", "Adajan");
        c.display();
    }
}
