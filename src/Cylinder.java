public class Cylinder {
    
    public double height;
    public double radius;

    public Cylinder(){

    }

    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public double getVolume(){
        return Math.PI*(radius*radius)*height;
    }
}
