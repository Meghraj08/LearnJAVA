package Collection;

import java.util.HashMap;

class Users {
    public String name, age, gender, mobile;

    public Users(String name, String age, String gender, String mobile) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Users{" +
                "Name = '" + name + '\'' +
                ", Age = '" + age + '\'' +
                ", Gender = '" + gender + '\'' +
                ", Mobile No. = '" + mobile + '\'' +
                '}';
    }
}

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Users> usersHashMap = new HashMap<>();
        usersHashMap.put("1", new Users("Meghraj", "20", "Male", "9408702808"));
        usersHashMap.put("2", new Users("Dev", "18", "Male", "9526817936"));
        usersHashMap.put("3", new Users("Riya", "27", "Female", "9487652013"));
        usersHashMap.put("4", new Users("Mohit", "36", "Male", "9876025719"));
        usersHashMap.put("5", new Users("Priyanka", "22", "Female", "9384751025"));
        System.out.println(usersHashMap.get("1"));
        System.out.println(usersHashMap.get("2"));
        System.out.println(usersHashMap.get("3"));
        System.out.println(usersHashMap.get("4"));
        System.out.println(usersHashMap.get("5"));
    }
}
