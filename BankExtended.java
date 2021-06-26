package Inheritance;

class Bank {
    static int id = 0;
    String bankName, address, mn;
}

class Customer extends Bank {
    static int id = 0;
    String name, gender, branch;
    double balance = 0.0;
    double interest = 0.0;
    double total = 0.0;

    public void display() {
        System.out.println(" * BANK DETAILS * ");
        System.out.println(" Name :- " + this.bankName);
        System.out.println(" Mobile Number :- " + this.mn);
        System.out.println(" Address :- " + this.address);
        System.out.println("\n" + "* CUSTOMER DETAILS * ");
        System.out.println(" Name :- " + name);
        System.out.println(" Gender :- " + gender);
        System.out.println(" Branch :- " + branch);
        System.out.println(" Balance :- " + balance);
        System.out.println(" Interest :- " + interest);
        System.out.println(" Total :- " + total);
    }
}

public class BankExtended {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.bankName = "HDFC Bank";
        c.mn = "0261-227749";
        c.address = "Adajan";
        c.name = "Meghraj Mahida";
        c.gender = "Male";
        c.branch = "Vesu";
        c.balance = 10000;
        c.interest = c.balance * 10 / 100;
        c.total = c.interest + c.balance;
        c.display();
    }
}
