public class GeometricFigure {
    private Point position;

    public GeometricFigure(double x, double y) {
        this.position = new Point(x, y);
    }

    public Point getPosition(){
        return position;
    }

    public void setPosition(Point position){
        this.position = position;
    }

    public double getGeometricFigure(Point p){
        return p.getX() + p.getY();
    }

    public String toString(){
        return position.toString();
    }
}
