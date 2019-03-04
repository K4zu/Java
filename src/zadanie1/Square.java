/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

/**
 *
 * @author macie
 */
public class Square extends Figure 
        implements Print{
    
    public Square(){}
    public Square(double a)
    {
        this.a = a;
    }

    @Override
    double calculateArea(double a) {
        return (a*a);
    }

    @Override
    double calculatePerimeter(double a) {
        return (4*a);
    }

    @Override
    public void print() {
        Square s = new Square();
        System.out.println("Pole figury wynosi");
        System.out.println("P= "+s.calculateArea(a));
        System.out.println("Obwod figury wynosi");
        System.out.println("Ob= "+s.calculatePerimeter(a));
    }
    
}
