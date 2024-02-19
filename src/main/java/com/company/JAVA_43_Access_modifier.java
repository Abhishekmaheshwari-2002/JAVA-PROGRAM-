package com.company;
class Cylinder{
    private int height;
    private int radius;
    //creating getter & setter using constructor
    Cylinder(int h1,int r1){
        height=h1;
        radius=r1;
    }
    public void setHeight(int h){
        this.height=h;
    }
    public int getHeight(){
        return this.height;
    }
    public void setRadius(int r){
        this.radius=r;
    }
    public int getRadius(){
        return this.radius;
    }
    public double volume () {
        return height*(radius*radius)*3.14;
    }
    public double surface_area () {
        return 2*3.14*height*radius;
    }

}
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public Rectangle() {
        this.length  = 4;
        this.breadth = 5;
    }
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }


}

public class JAVA_43_Access_modifier {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(12,8);
//        cyl.setHeight(12);
//        cyl.setRadius(4);
        System.out.println("Height : "+cyl.getHeight());
        System.out.println("Radius : "+cyl.getRadius());
        System.out.println("volume : "+cyl.volume());
        System.out.println("surface area : "+cyl.surface_area());

        Rectangle rec =new Rectangle(46,63);
        System.out.println("Breadth : "+rec.getBreadth());
        System.out.println("length : "+rec.getLength());


    }
}
