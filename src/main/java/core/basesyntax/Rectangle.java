package core.basesyntax;

public class Rectangle extends Figure {
    private final double wide;
    private final double length;

    public Rectangle(String color, double wide, double length) {
        super(color);
        this.wide = wide;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWide() {
        return wide;
    }

    @Override
    public double calculateArea() {
        double area = wide * length;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + ", wide: " + getWide()
                + ", length:" + getLength()
                + ", color: " + getColor());
    }
}