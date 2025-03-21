package org.example;

public class Wall {
    private  double height;
    private double width;
    public Wall(double height ,double width){
        this.height=height;
        this.width=width;
    }
    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public double getArea(){
        return width*height;
    }
}
