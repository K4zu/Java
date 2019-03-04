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
public class Circle extends Figure 
        implements Print{
    
    public Circle(){}
    public Circle(double a)
    {
        this.a = a;
    }

    @Override
    double calculateArea(double a) {
        return (a*a*3.14);
    }

    @Override
    double calculatePerimeter(double a) {
        return (2*a*3.14);
    }

    @Override
    public void print() {
        Circle c = new Circle();
        System.out.println("Pole figury wynosi");
        System.out.println("P= "+c.calculateArea(a));
        System.out.println("Obwod figury wynosi");
        System.out.println("Ob= "+c.calculatePerimeter(a));
    }
    
}
