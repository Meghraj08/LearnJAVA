public class Aggregation {
    public static void main(String[] args) {

        Students meghraj = new Students();
        meghraj.name = "Meghraj Mahida";
        meghraj.age = 20;
        meghraj.mn = "9408702808";
        meghraj.address = "Vesu";
        meghraj.display();

        Teacher sumit = new Teacher();
        sumit.name = "Sumit More";
        sumit.age = 25;
        sumit.mn = "9876543210";
        sumit.address = "Adajan";
        sumit.display();

        Course java = new Course();
        java.fees = 12000;
        java.gst = java.fees * 18 / 100;
        java.total = java.gst + java.fees;
        java.courseName = "JAVA";
        java.display();

    }
}

class Students {
    static int id = 0;
    String name, address, mn;
    double age;

    public Students() {
    }

    public Students(String name, String address, String mn, double age) {
        id += 1;
        this.name = name;
        this.address = address;
        this.age = age;
        this.mn = mn;
    }

    public void display() {
        System.out.println(" * STUDENT DETAILS * ");
        System.out.println(" Name :- " + name);
        System.out.println(" Age :- " + age);
        System.out.println(" Mobile Number :- " + mn);
        System.out.println(" Address :- " + address);
    }
}

class Teacher {
    static int id = 0;
    String name, address, mn;
    double age;

    public Teacher() {
    }

    public Teacher(String name, String address, String mn, double age) {
        id += 1;
        this.name = name;
        this.address = address;
        this.age = age;
        this.mn = mn;
    }

    public void display() {
        System.out.println("\n" + " * TEACHER DETAILS * ");
        System.out.println(" Name :- " + name);
        System.out.println(" Age :- " + age);
        System.out.println(" Mobile Number :- " + mn);
        System.out.println(" Address :- " + address);
    }
}

class Course {
    static int id = 0;
    String courseName;
    double fees = 0.0;
    double gst = 0.0;
    double total = 0.0;

    public Course(String courseName, double fees, double gst, double total) {
        id += 1;
        this.courseName = courseName;
        this.fees = fees;
        this.gst = gst;
        this.total = total;
    }

    public Course() {
    }

    public void display() {
        System.out.println("\n" + "* COURSE DETAILS * ");
        System.out.println(" Course Name :- " + courseName);
        System.out.println(" Fees :- " + fees);
        System.out.println(" Gst :- " + gst);
        System.out.println(" Total :- " + total);
    }
}
