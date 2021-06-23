public class Student1 {

    static int id = 0;
    String name, course;
    double fees = 0.0;
    double gst = 0.0;
    double total = 0.0;

    public static void main(String[] args) {

        Student meghraj = new Student();
        meghraj.name = "Meghraj Mahida";
        meghraj.course = "JAVA";
        meghraj.fees = 1000;
        meghraj.gst = meghraj.fees * 18 / 100;
        meghraj.total = meghraj.gst + meghraj.fees;

        Student dev = new Student();
        dev.name = "Dev Jain";
        dev.course = "PHP";
        dev.fees = 1500;
        dev.gst = dev.fees * 18 / 100;
        dev.total = dev.gst + dev.fees;

        String n = args[0];
        int d = Integer.parseInt(n);
        switch (n) {
            case "1":
                meghraj.display();
                break;
            case "2":
                dev.display();
                break;
        }
    }

    void display() {
        System.out.println(" ID :- " + id);
        System.out.println(" NAME :- " + name);
        System.out.println(" COURSE :- " + course);
        System.out.println(" FEES :- " + fees);
        System.out.println(" GST :- " + gst);
        System.out.println(" TOTAL :- " + total);
    }
}
