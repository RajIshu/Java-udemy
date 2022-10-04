public class Wall {
    private double width;
    private double height;

    public Wall(){
        this(0,0);
    }

    public Wall(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getArea(){
        return width * height;
    }
}
