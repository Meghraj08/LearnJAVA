package Collection;

import java.util.HashMap;

class User {
    public String name, pass;

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}

public class MapColl {
    public static void main(String[] args) {
        HashMap<String, String> nameList = new HashMap<>();
        nameList.put("sumit", "sumit more");
        nameList.put("meghraj", "dev jain");
        nameList.put("meghraj", "meghraj mahida");
        nameList.putIfAbsent("meghraj", "sumit more");
        System.out.println(nameList);

        HashMap<String, User> userList = new HashMap<>();
        userList.put("sumit", new User("sumit", "sample"));
        userList.put("meghraj", new User("meghraj", "sample"));
        System.out.println(userList.get("meghraj"));
    }
}
