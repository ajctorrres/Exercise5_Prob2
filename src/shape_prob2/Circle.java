/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shape_prob2;

/**
 *
 * @author torresar_cis21035
 */
public class Circle extends Shape{
     protected double radius;
    
    public Circle(){
  
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }
    public String toString(){
        return "A Circle with radius = " +this.radius+ " which is a subclass of "+super.toString();
    }
}
