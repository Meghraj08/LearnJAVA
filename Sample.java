package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("Meghraj");
        arrayList.add(100.44f);
        arrayList.add(true);

        System.out.println(arrayList.get(0));
        arrayList.forEach(o -> {
            System.out.println(o);
        });

        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> name2 = new ArrayList<>();
        name.add("Meghraj");
        name.add("Dev");
        name2.add("2Meghraj");
        name2.add("3Dev");
        System.out.println(name);
        name.forEach(System.out::println);

        name.add(0, "Sumit");
        System.out.println(name);
        System.out.println(name.contains("Dev"));
        System.out.println(name.indexOf("Dev"));
        System.out.println(name.get(0));
        name.addAll(name2);
        System.out.println(name);
        name.remove("Dev");
        System.out.println(name);
        name.removeAll(name2);
        System.out.println(name);
        //name.clear();// data clear
        System.out.println(name.isEmpty());
        System.out.println(name.size());
        name.set(0, "Xyz");
        System.out.println(name);
        name.sort(String::compareTo);
        System.out.println(name);
        System.out.println(Arrays.toString(name.toArray()));
        System.out.println(name.subList(1, 2));
    }
}
