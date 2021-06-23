public class Bank {

    static int id = 0;
    String name, gender, branch;
    double balance = 0.0;
    double interest = 0.0;
    double total = 0.0;

    Bank() {
        id += 1;
    }

    public static void main(String[] args) {

        Bank meghraj = new Bank();
        meghraj.name = "Meghraj Mahida";
        meghraj.gender = "Male";
        meghraj.branch = "Vesu";
        meghraj.balance = 10000;
        meghraj.interest = meghraj.balance * 10 / 100;
        meghraj.total = meghraj.interest + meghraj.balance;
        meghraj.display();

        Bank dev = new Bank();
        dev.name = "Dev Jain";
        dev.gender = "Male";
        dev.branch = "Adajan";
        dev.balance = 15000;
        dev.interest = dev.balance * 10 / 100;
        dev.total = dev.interest + dev.balance;
        dev.display();

        Bank aniket = new Bank();
        aniket.name = "Aniket Raval";
        aniket.gender = "Male";
        aniket.branch = "Katargam";
        aniket.balance = 12000;
        aniket.interest = aniket.balance * 10 / 100;
        aniket.total = aniket.interest + aniket.balance;
        aniket.display();

        Bank saransh = new Bank();
        saransh.name = "Saransh Solanki";
        saransh.gender = "Male";
        saransh.branch = "Dindoli";
        saransh.balance = 5000;
        saransh.interest = saransh.balance * 10 / 100;
        saransh.total = saransh.interest + saransh.balance;
        saransh.display();

        Bank alia = new Bank();
        alia.name = "Alia Bhatt";
        alia.gender = "Female";
        alia.branch = "Althan";
        alia.balance = 20000;
        alia.interest = alia.balance * 10 / 100;
        alia.total = alia.interest + alia.balance;
        alia.display();
    }

    void display() {
        System.out.println(" ID :- " + id);
        System.out.println(" NAME :- " + name);
        System.out.println(" GENDER :- " + gender);
        System.out.println(" BRANCH :- " + branch);
        System.out.println(" BALANCE :- " + balance);
        System.out.println(" INTEREST :- " + interest);
        System.out.println(" TOTAL :- " + total);
    }

    void addBank(String n, String g, String br, double b, double i, double t) {
        name = n;
        gender = g;
        branch = br;
        balance = b;
        interest = i;
        total = t;
    }
}
