
public class Circle {
    public double radius;
    public double diameter;

    public Circle(){

    }

    public Circle(double radius, double diameter){
        this.radius = radius;
        this.diameter = diameter;
    }

    public double getArea(){
        return Math.PI*(this.radius*this.radius);
    }

    public double getParameter(){
        return 2*Math.PI*this.radius;
    }
}
