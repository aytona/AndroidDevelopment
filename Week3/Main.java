package com.aytona;

public class Main
{
    public static void main(String[] args)
    {
        Circle c = new Circle(1);
        System.out.println("Area: " + c.area());

        TwoDShape s = new TwoDShape(5, 10);
        s.showDim();

        Deck myDeck = new Deck();
        Deck.Iterator i = myDeck.getIterator();
        while(i.hasNext())
        {
            System.out.print(i.next() + ", ");
        }

        Square sq = new Square(5);
        System.out.println("Perimeter: " + sq.perimeter() + " Area: " + sq.area());
    }
}
