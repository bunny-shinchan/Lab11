/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovweek11;

/**
 *
 * @author verms
 */
public class Rectangle
{
    int length;
    int breadth;
    
    Rectangle (){
    
    }
    
    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    
    int getArea()
    {
        return length * breadth;
    }

    int getPerimeter()
    {
        return 2 * (length + breadth);
    }
}
