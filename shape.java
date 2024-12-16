import java.util.Scanner;

class PrintInfo {
    static void print() {
        System.out.println("Name: raghav kaushal");
        System.out.println("USN: 1BM23CS257");
    }
}

abstract class Shape {
    int dim1;
    int dim2;

    abstract void printarea();
}

class Rectangle extends Shape {
    public void printarea() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length and breadth:");
        dim1 = s.nextInt();
        dim2 = s.nextInt();
        int area = dim1 * dim2;
        System.out.println("Area of rectangle: " + area);
    }
}

class Triangle extends Shape {
    public void printarea() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base and height:");
        dim1 = s.nextInt();
        dim2 = s.nextInt();
        double area = (dim1 * dim2) / 2.0;
        System.out.println("Area of triangle: " + area);
    }
}

class Circle extends Shape {
    final double Pi = 3.14;

    public void printarea() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius:");
        dim1 = s.nextInt();
        double area = Pi * dim1 * dim1;
        System.out.println("Area of circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        PrintInfo.print();

        Rectangle r = new Rectangle();
        r.printarea();

        Triangle t = new Triangle();
        t.printarea();

        Circle c = new Circle();
        c.printarea();
    }
}
