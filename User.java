package String;

import java.util.Objects;

public class User {
    static int id;
    String name;

    User() {
        id += 1;
    }

    private String repeator(char c, int num) {
        String re = "";
        for (int i = 0; i < num; i++) {
            re = re.concat(String.valueOf(c));
        }
        return re;
    }

    @Override
    public String toString() {
        int sameple = String.format("| %-10s | %10d |\n", "ID", id).length();
        String card = "";
        card += repeator('-', sameple - 1);
        card += String.format("\n| %-10s | %10d |\n", "ID", id);
        card += String.format("| %-10s | %10s |\n", "NAME", name);
        card += repeator('-', sameple - 1);
        return card;
    }

    public static void main(String[] args) {
        User user = new User();
        user.name = "Sumit";
        System.out.println(user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}