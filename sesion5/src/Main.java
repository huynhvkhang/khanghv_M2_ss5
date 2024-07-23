public class Main {
    public static void main(String[] args) {
        // Create Circle object and test its methods
        Circle circle = new Circle(3.0, "blue");
        System.out.println(circle.toString()); // Output Circle details
        Cylinder cylinder = new Cylinder(4.0, "green", 9.0);
        System.out.println(cylinder.toString()); // Output Cylinder details
    }
}
