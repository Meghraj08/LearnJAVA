public class Method2 {
    public static void displayStudent(String name, String age, String gender, String mob, String add) {
        System.out.println("NAME :- " + name);
        System.out.println("AGE :- " + age);
        System.out.println("GENDER :- " + gender);
        System.out.println("MOBILE :- " + mob);
        System.out.println("ADDRESS :- " + add);
    }

    public static void main(String[] args) {
        displayStudent(args[0], args[1], args[2], args[3], args[4]);
    }
}