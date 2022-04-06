package AbstractLesson.tasks;

public abstract class Shape {
    private int numSides;

    public Shape() {
    }

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public abstract void getArea();
    public abstract void getPerimeter();


    public double getNumSides() {
        return numSides;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "numSides=" + numSides +
                '}';
    }
}
