package Geometric;

public class GeometricObject {
    protected String color;
    protected  GeometricObject(){

    }
    protected GeometricObject(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
