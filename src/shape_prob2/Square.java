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
public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
    }
    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
     public String toString(){
        return "A Square with side = " +this.getWidth()+ " which is a subclass of "+super.toString();
    }
}
