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
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    
    public Rectangle(){
       
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
    }
    
     public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    } 
     
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
     
    public double getArea(){
        double area = this.width * this.length; 
        return area; 
    }
    
    public double getPerimeter(){
        double perimeter = (this.length * 2) + (this.width * 2);
        return perimeter;
    }
    
    public String toString(){
        return "A Rectangle with width = " +this.getWidth()+ "and length = " +this.getLength()+ " which is a subclass of "+super.toString();
    }
}
