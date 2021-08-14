package Collection;

import java.util.ArrayList;
import java.util.List;

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
        name.add("Meghraj");
        name.add("Dev");
        System.out.println(name);
        name.forEach(System.out::println);
    }
}

interface Calac {
    int add(int a, int b);
}
