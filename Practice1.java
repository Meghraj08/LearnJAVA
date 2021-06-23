public class Practice1 {
    public static void main(String[] args){
        int a = 10;
        float b = 20.333f;
        long c = 202L;
        double d = 255554.323;
        char e = 'd';
        boolean f = true;

        // class data types
        Integer a1 = 20293;
        Float a2 = 23.232f;
        Long a3 = 23323L;
        Double a4 = 3443.4343;
        Character a5 = 's';
        Boolean a6 = true;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("a1 = "+ a1);

        //type casting
        a1 = a2.intValue();
        System.out.println("a1 = "+ a1);

        a = Integer.parseInt(args[0]);
        System.out.println("a " + a);

    }
}
