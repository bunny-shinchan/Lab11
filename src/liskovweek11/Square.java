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
public class Square extends Rectangle
{
   
    public void setLength(int length){
        this.length=length;
        this.breadth=length;
    }
    public void setWidth(){
        this.length=breadth;
        this.breadth=breadth;
    }
}
