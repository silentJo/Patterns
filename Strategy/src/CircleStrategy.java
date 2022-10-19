public class CircleStrategy {
    @Override
    public Shape createShape(double diameter, Point center) {
        return new Circle(diameter, center);
    }
}
