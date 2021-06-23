public class ControlSt {
    public static void main(String[] args) {
        int  a = 10, b= 20;

        if (a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

        int c =24234;


        if(a > b && a > c){
            System.out.println(a);
        }else if(b > a && b > c){
            System.out.println(b);
        }else if(c > a && c > b){
            System.out.println(c);
        }else{
            System.out.println("No");
        }

        a= 12;
        switch (a){
            case 10:
                System.out.println(10);
                break;
            case 12:
                System.out.println(12);
                break;
               default:
                System.out.println("default");
        }
    }
}
