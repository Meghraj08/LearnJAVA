package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Type2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Dev");
        LinkedList<String> item = new LinkedList<>();
        item.add("Sumit");
        item.addAll(names);
        System.out.println(item);

        HashSet<String> namesList = new HashSet<>();
        namesList.add("sumit");
        namesList.add("Amit");
        namesList.add("Meghraj");
        namesList.add("Rohit");
        namesList.add("sumit2");
        System.out.println(namesList);
    }
}
