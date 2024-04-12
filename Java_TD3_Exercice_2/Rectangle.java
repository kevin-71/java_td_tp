public class Rectangle extends GeometricFigure {
    private double height;
    private double width;
    public Rectangle(){
        super(0, 0);
    }

    public Rectangle(double x, double y, double height, double width){
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public Rectangle(int x, int y){
        super(x, y);
    }

    // copy constructor
    public Rectangle(Rectangle o){
        super(o.getPosition().getX(), o.getPosition().getY());
    }

    public String toString(){
        return "(" + getPosition() + " " + this.height + " " + this.width + ")";
    }
}