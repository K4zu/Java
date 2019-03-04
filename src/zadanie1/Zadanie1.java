/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import java.util.Scanner;

/**
 *
 * @author macie
 */
public class Zadanie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        while(true)
        {
            System.out.println("Witaj w programie liczacym pole figur");
            System.out.println("Aby wybrac trojkat nasisnij 1");
            System.out.println("Aby wybrac kwadrat nasisnij 2");
            System.out.println("Aby wybrac kolo nasisnij 3");
            System.out.println("Aby wyjsc z programu nacisnij 4");
            
            Scanner scanner = new Scanner(System.in);
            
            int y = scanner.nextInt();
            
            if(y==1)
            {
                System.out.println("Wybrales trojkat, podaj podstawe");
                
                try {
                    double x = scanner.nextDouble();
                    Triangle t = new Triangle(x);
                    
                    if(x<0)
                    {
                        System.out.println("Podales liczbe mniejsza od 0");
                        continue;
                    }

                    t.print();
                }
                catch(Exception e)
                {
                    System.out.println("To nie jest liczba!");
                }
                
            }
            else if (y==2)
            {
                System.out.println("Wybrales kwadrat, podaj bok a");
                
                try {
                    double x = scanner.nextDouble();
                    Square s = new Square(x);
                    
                    if(x<0)
                    {
                        System.out.println("Podales liczbe mniejsza od 0");
                        continue;
                    }
                    
                    s.print();
                }
                catch(Exception e)
                {
                    System.out.println("To nie jest liczba!");
                }
            }
            else if (y==3)
            {
                System.out.println("Wybrales kolo, podaj promien");
                
                try {
                    double x = scanner.nextDouble();
                    
                    Circle c = new Circle(x);
                    
                    if(x<0)
                    {
                        System.out.println("Podales liczbe mniejsza od 0");
                        continue;
                    }
                    
                    c.print();
                }
                catch(Exception e)
                {
                    System.out.println("To nie jest liczba!");
                }
                
            }
            else if (y==4)
            {
                break;
            }
        }
        // TODO code application logic here
    }
    
    
}



