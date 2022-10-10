package com.jattwaadi.shape;

class Rectangle{
    int l, b;

    public void setL(int length){
        this.l = length;
    }

    public void setB(int breadth){
        this.b = breadth;
    }

    public int getArea(){
        return 2*(this.l+this.b);
    }
    
}

class Square{ 
    int s;

    public void setS(int side){
        this.s = side;
    }

    public int getArea(){
        return (this.s*this.s);
    }

}

class Circle{
    int r;

    public void setRadius(int radius){
        this.r = radius;
    }

    public double getArea(){
        return (Math.PI*this.r*this.r);
    }
    
}

class Cylinder{
     int r,h;

    public void setRadius(int radius){
        this.r = radius;
    }
    
    public void setHeight(int height){
        this.h = height;
    }

    public double getArea(){
        return (Math.PI*this.r*this.r*this.h);
    }
    

}


public class CustomPackage{
    public static void main(String[] args){
        Rectangle r = new Rectangle();

        r.setL(4);
        r.setB(4);
        System.out.println("Area of Rectangle "+r.getArea());

        Square s = new Square();

        s.setS(2);
        System.out.println("Area of Square "+s.getArea());

        Circle c = new Circle();

        c.setRadius(2);
        System.out.println("Area of Circle "+c.getArea());

        Cylinder cy = new Cylinder();

        cy.setRadius(4);
        cy.setHeight(15);
        System.out.println("Area of Cylinder "+cy.getArea());
    }
}