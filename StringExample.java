package String;

public class StringExample {
    public static void main(String[] args) {
        String name = "Sumit", name1 = new String("Sumit");
        System.out.println(name);
        name += " More";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.equals(name));
        System.out.println(name.equals(name.toLowerCase()));
        System.out.println(name.contains("Sumit"));
        System.out.println(name.contains("sumit"));
        System.out.println(name.compareTo(name.toUpperCase())); // "Su" SU -> a - 97 A - 65 32
        System.out.println(name.compareTo(name.toLowerCase())); // "Su" su -> a - 97 A - 65 32
        System.out.println(name.compareToIgnoreCase(name.toLowerCase()));
        System.out.println(name.concat(" More"));
        System.out.println(name.indexOf("i"));
        System.out.println(name.indexOf("More"));
        System.out.println(name.concat(" More").indexOf(" More", name.length()));
        System.out.println(name.charAt(name.length() - 6));
        char[] n = name.toCharArray();
        for (char c : n) {
            System.out.println(c);
        }

        String nameLists = "Sumit,Shubham,Ankit,Dev,Meghraj";
        String[] nameL = nameLists.split(",");

        String string = String.join("-", nameL);
        System.out.println(string);

        System.out.println(name.concat(" More").startsWith("Sumit"));
        System.out.println(name.concat(" More").endsWith("More"));
        System.out.println(name.concat("More").startsWith("More", name.length()));

        System.out.println(name.replace("Sumit", "Kevil"));
        System.out.println(name.concat("More").replaceAll("More", "Sharma"));
        System.out.println(name.isEmpty());
        System.out.println(name.hashCode());
        name = "                            Sumit More                     ";
        System.out.println(name);
        name = name.trim();
        System.out.println(name);

        int a = 10;
        float b = 20;
        String fm = String.format("|a    = %20d|\n|b    = %20.2f|\n|name = %20s|", a, b, name);
        System.out.println(fm);
    }
}
