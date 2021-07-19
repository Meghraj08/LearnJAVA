package ArrayString;

class ObjectArray {
    static int id;
    int mark;

    ObjectArray(int mark) {
        id += 1;
        this.mark = mark;
    }

    void display() {
        System.out.println(id);
        System.out.println(this.mark);
    }
}

public class Array {
    public static void marksSum(ObjectArray[] st) {
        int sum = 0;
        for (ObjectArray ob : st) {
            sum += ob.mark;
        }
        System.out.println("Total :- " + sum);
        System.out.println("AVG :- " + sum / st.length);
    }

    public static void main(String[] args) {
        ObjectArray[] st = new ObjectArray[2];
        for (int i = 0; i < st.length; i++) {
            st[i] = new ObjectArray((int) (Math.random() * 100));
            st[i].display();
        }
        marksSum(st);
    }
}
