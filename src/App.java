public class App {
    public static void main(String[] args) throws Exception {
        Circle newCircle = new Circle(15,30);

        System.out.println("Area of the circle is: " + newCircle.getArea()); 
        System.out.println("Perimeter of the circle is: " + newCircle.getParameter());

        Cylinder newCylinder = new Cylinder(10,20);
        System.out.println("Volume of the cylinder is: " + newCylinder.getVolume());
    }
}
