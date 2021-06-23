public class Bank1 {

    static int id = 0;
    String name, gender, branch;
    double balance = 0.0;
    double interest = 0.0;
    double total = 0.0;

    public static void main(String[] args) {

        Bank meghraj = new Bank();
        meghraj.name = "Meghraj Mahida";
        meghraj.gender = "Male";
        meghraj.branch = "Vesu";
        meghraj.balance = 10000;
        meghraj.interest = meghraj.balance * 10 / 100;
        meghraj.total = meghraj.interest + meghraj.balance;

        Bank dev = new Bank();
        dev.name = "Dev Jain";
        dev.gender = "Male";
        dev.branch = "Adajan";
        dev.balance = 15000;
        dev.interest = dev.balance * 10 / 100;
        dev.total = dev.interest + dev.balance;

        Bank aniket = new Bank();
        aniket.name = "Aniket Raval";
        aniket.gender = "Male";
        aniket.branch = "Katargam";
        aniket.balance = 12000;
        aniket.interest = aniket.balance * 10 / 100;
        aniket.total = aniket.interest + aniket.balance;

        Bank saransh = new Bank();
        saransh.name = "Saransh Solanki";
        saransh.gender = "Male";
        saransh.branch = "Dindoli";
        saransh.balance = 5000;
        saransh.interest = saransh.balance * 10 / 100;
        saransh.total = saransh.interest + saransh.balance;

        Bank alia = new Bank();
        alia.name = "Alia Bhatt";
        alia.gender = "Female";
        alia.branch = "Althan";
        alia.balance = 20000;
        alia.interest = alia.balance * 10 / 100;
        alia.total = alia.interest + alia.balance;

        String n = args[0];
        int d = Integer.parseInt(n);
        switch (n) {
            case "1":
                meghraj.display();
                break;
            case "2":
                dev.display();
                break;
            case "3":
                aniket.display();
                break;
            case "4":
                saransh.display();
                break;
            case "5":
                alia.display();
                break;
        }
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
}
