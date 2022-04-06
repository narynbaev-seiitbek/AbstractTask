package AbstractLesson.tasks;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle( double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        double area = (width*height);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2*(height*width);
    }
}
