/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovweek11;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author verms
 */
public class ShapedDemo {
    public static void calculateArea(Rectangle r){
        r.setBreadth(2);
        r.setLength(3);
        
        assertEquals("Area of calculation is incorrect", r.getArea(),6);
    }
   
   public static void main (String [] args){
       ShapedDemo.calculateArea(new Rectangle());
       
       ShapedDemo.calculateArea(new Square());
       }
}