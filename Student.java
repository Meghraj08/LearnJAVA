public class Student {
    static int id = 0;
    String name, course;
    double fees = 0.0;
    double gst = 0.0;
    double total = 0.0;

    Student() {
        id += 1;
    }

    public static void main(String[] args) {

        Student meghraj = new Student();
        meghraj.name = "Meghraj Mahida";
        meghraj.course = "JAVA";
        meghraj.fees = 1000;
        meghraj.gst = meghraj.fees * 18 / 100;
        meghraj.total = meghraj.gst + meghraj.fees;
        meghraj.display();

        Student dev = new Student();
        dev.name = "Dev Jain";
        dev.course = "PHP";
        dev.fees = 1500;
        dev.gst = dev.fees * 18 / 100;
        dev.total = dev.gst + dev.fees;
        dev.display();
    }

    void display() {
        System.out.println(" ID :- " + id);
        System.out.println(" NAME :- " + name);
        System.out.println(" COURSE :- " + course);
        System.out.println(" FEES :- " + fees);
        System.out.println(" GST :- " + gst);
        System.out.println(" TOTAL :- " + total);
    }

    void addStudent(String n, String c, double f, double g, double t) {
        name = n;
        course = c;
        fees = f;
        total = t;
        gst = g;
    }
}
