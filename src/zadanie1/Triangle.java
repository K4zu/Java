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
public class Triangle extends Figure 
        implements Print {
    
    public Triangle(){System.out.println("test");
    this.a = 10;}
    public Triangle(double a)
    {
        this.a = a;
    }

    @Override
    double calculateArea(double a) {
        return ((a*a*1.71)/4);
    }

    @Override
    double calculatePerimeter(double a) {
        return (3*a);
    }

    @Override
    public void print() {
        Triangle t = new Triangle();
        System.out.println("Pole figury wynosi");
        System.out.println("P= "+t.calculateArea(a));
        System.out.println("Obwod figury wynosi");
        System.out.println("Ob= "+t.calculatePerimeter(a));
    }
    
    
}
