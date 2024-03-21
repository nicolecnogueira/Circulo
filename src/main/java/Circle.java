public class Circle{

    public float radius;

    Circle(float radius){
        this.radius = radius;
    }

    public double area(float radius){
        return Math.PI * radius * radius;
    }

    public double circumference(float radius){
        return 2 * Math.PI * radius;
    }

}