package Inheritance;

class Students {
    static int id = 0;
    String name, address, mn;
    double age;
}

class Course extends Students {
    static int id = 0;
    String courseName;
    double fees = 0.0;
    double gst = 0.0;
    double total = 0.0;

    public void display() {
        System.out.println(" * STUDENT DETAILS * ");
        System.out.println(" Name :- " + this.name);
        System.out.println(" Age :- " + this.age);
        System.out.println(" Mobile Number :- " + this.mn);
        System.out.println(" Address :- " + this.address);
        System.out.println("\n" + "* COURSE DETAILS * ");
        System.out.println(" Course Name :- " + courseName);
        System.out.println(" Fees :- " + fees);
        System.out.println(" Gst :- " + gst);
        System.out.println(" Total :- " + total);
    }
}

public class AggregationExtended {
    public static void main(String[] args) {
        Course c = new Course();
        c.name = "Meghraj Mahida";
        c.age = 20;
        c.mn = "9408702808";
        c.address = "Vesu";
        c.fees = 12000;
        c.gst = c.fees * 18 / 100;
        c.total = c.gst + c.fees;
        c.courseName = "JAVA";
        c.display();
    }
}
