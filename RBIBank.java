package hidden;

class RBI {
    void display() {
    }
}

class Bank extends RBI {
    static int id = 0;
    String name, branch, code;

    public Bank() {
        id += 1;
    }

    Bank(String name, String branch, String code) {
        this.name = name;
        this.branch = branch;
        this.code = code;
    }

    void display() {
        super.display();
        System.out.println(" * BANK DETAILS * ");
        System.out.println(" ID :- " + id);
        System.out.println(" NAME :- " + name);
        System.out.println(" BRANCH :- " + branch);
        System.out.println(" CODE NUMBER :- " + code);
    }
}

class Customer extends RBI {
    static int id = 0;
    String fname, lname, address, mobile, pincode;

    Customer(String fname, String lname, String address, String mobile, String pincode) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.mobile = mobile;
        this.pincode = pincode;
    }

    void display() {
        super.display();
        System.out.println("\n" + " * CUSTOMER DETAILS * ");
        System.out.println(" FIRST NAME :- " + fname);
        System.out.println(" LAST NAME :- " + lname);
        System.out.println(" ADDRESS :- " + address);
        System.out.println(" MOBILE NUMBER :- " + mobile);
        System.out.println(" PINCODE :- " + pincode);
    }
}

public class RBIBank {
    public static void main(String[] args) {
        RBI rbi;
        rbi = new Bank("SBI", "ADAJAN", "395009");
        rbi.display();
        rbi = new Customer("MEGHRAJ", "MAHIDA", "VESU", "9408702808", "395007");
        rbi.display();
    }
}
