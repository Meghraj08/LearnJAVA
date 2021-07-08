package hidden;

class Shape {

    void area() {
        System.out.println(" Shape Area ");
    }
}

class Square extends Shape {
    private int size;

    Square(int size) {
        this.size = size;
    }

    @Override
    void area() {
        super.area();
        System.out.println(" Area :-  " + (size * size));
    }

    // method overloading
    void area(int size) {
        super.area();
        System.out.println(" Area :-  " + (size * size));
    }
}

class Rectangle extends Shape {
    int h, w;

    Rectangle(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    void area() {
        super.area();
        System.out.println(" Area :- " + (h * w));
    }
}

public class UpCasting {
    public static void main(String[] args) {
        Shape shape;

        shape = new Square(100); // upcasting
        shape.area();

        shape = new Rectangle(10, 20);
        shape.area();
    }
}
