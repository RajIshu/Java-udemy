public class Point {
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        int sqrX = this.x * this.x;
        int sqrY = this.y * this.y;

        return Math.sqrt(sqrX + sqrY);
    }

    public double distance(int x, int y){
        int sqrX = (this.x - x) * (this.x - x);
        int sqrY = (this.y - y) * (this.y - y);

        return Math.sqrt(sqrX + sqrY);
    }

    public double distance(Point P){
        int sqrX = (this.x - P.getX()) * (this.x - P.getX());
        int sqrY = (this.y -P.getY()) * (this.y -P.getY());

        return Math.sqrt(sqrX + sqrY);
    }

}
