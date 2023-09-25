package project2;


    interface Shape {
    // Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter. Create 2 classes Circle & Square that
    //implements functionality defined in the Shape Interface. Test your code
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
    class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * side;
        }
    }


public class ShapeTester {
    public static void main(String[] args) {


        Circle circle = new Circle(5);


        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());


        Square square = new Square(4);


        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
    }
}
