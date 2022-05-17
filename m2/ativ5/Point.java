
public final class Point{
    private final double x;
    private final double y;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }
    private Point(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    public Double getX(){
        return this.x;
    }

    public Double getY(){
        return this.y;
    }

    public Point translate(Double x, Double y){
        return new Point(this.x+x,this.y+y);
    }

    public Point scale(Double value){
        return new Point(this.x*value,this.y*value);
    }

}