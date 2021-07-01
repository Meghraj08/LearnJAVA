package access;

class GrandParent {
    static int id = 0;
    String name;
    public int age;
    private int salary;
    protected String property;

    GrandParent() {
        id += 1;
    }

    public GrandParent(String name, int age, int salary, String property) {
        this();
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.property = property;
    }

    protected void display() {
        System.out.println(" * GrandParent Details * ");
        System.out.println(" Id :- " + id);
        System.out.println(" Name :- " + name);
        System.out.println(" Age :- " + age);
        System.out.println(" Salary :- " + salary);
        System.out.println(" Property :- " + property);
    }
}

class Parent extends GrandParent {
    static int id = 0;
    String name;
    public int age;
    private int salary;
    protected String property;

    public Parent(String name, int age, int salary, String property) {
        super(name, age, salary, property);
        id += 1;
    }

    void setMyData(String name, int age, int salary, String property1) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.property = property1;
    }

    void displayMyData() {
        super.display();
        System.out.println("\n" + " * Parent Details * ");
        System.out.println(" Id :- " + id);
        System.out.println(" Name :- " + name);
        System.out.println(" Age :- " + age);
        System.out.println(" Salary :- " + salary);
        System.out.println(" Property :- " + property);
    }
}

class Child extends Parent {
    static int id = 0;
    String name;
    public int age;
    private int salary;
    protected String property;

    public Child(String name, int age, int salary, String property) {
        super(name, age, salary, property);
        id += 1;
    }

    public void setMyParent(String name, int age, int salary, String property1) {
        super.setMyData(name, age, salary, property1);
    }

    public void setMyDetails(String name, int age, int salary, String property1) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.property = property1;
    }

    public void displayMe() {
        super.displayMyData();
        System.out.println("\n" + " * Child Details * ");
        System.out.println(" Id :- " + id);
        System.out.println(" Name :- " + name);
        System.out.println(" Age :- " + age);
        System.out.println(" Salary :- " + salary);
        System.out.println(" Property :- " + property);
    }
}

public class ParentChild {
    public static void main(String[] args) {
        Child c = new Child("ABC", 75, 1000, "Land");
        c.setMyParent("PQR", 50, 1200, "Plot");
        c.setMyDetails("XYZ", 20, 2000, "Hotel");
        c.displayMe();
    }
}
