package AbstractLesson.tasks;

public class RtTriangle extends Shape{

    private double width;
    private double height;

    public RtTriangle() {
    }

    public RtTriangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        
    }

    @Override
    public void getPerimeter() {

    }
}
