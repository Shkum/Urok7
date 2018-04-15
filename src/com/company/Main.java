package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Dz1();

        // Dz2();

        Dz3(); // В классную работу даже не загянул, чесно.


    }

    private static void Dz1() {
        DomZad1 x = new DomZad1();
        double a1 = 1.1, a2 = 2.2, a3 = 3.3;
        double b1 = 1.1, b2 = 2.2, b3 = 3.3;
        System.out.println(x.MinusRezult(a1, a2, a3, b1, b2, b3));
        System.out.println(x.PlusRezult(a1, a2, a3, b1, b2, b3));
        System.out.println(x.MultyplyRezult(a1, a2, a3, b1, b2, b3));
        System.out.println(x.ReverseMinusRezult(a1, a2, a3, b1, b2, b3));
        System.out.println(x.ReversePlusRezult(a1, a2, a3, b1, b2, b3));
        System.out.println(x.ReverseMultyplyRezult(a1, a2, a3, b1, b2, b3));
    }

    private static void Dz2() {
        DomZad2 dz2 = new DomZad2();
        double a[][] = {{1.1, 2.2, 3.3}, {1.1, 2.2, 3.3}, {1.1, 2.2, 3.3}};
        double b[][] = {{1.1, 2.2, 3.3}, {1.1, 2.2, 3.3}, {1.1, 2.2, 3.3}};
        dz2.printResult(dz2.SlozhenieMatric(a, b));
        System.out.println();
        dz2.printResult(dz2.VichitanieMatric(a, b));
        System.out.println();
        dz2.printResult(dz2.UmnoohenieMatric(a, b));
        System.out.println();
        dz2.printResult(dz2.UmnoohenieMatricNaChislo(dz2.SlozhenieMatric(dz2.UmnoohenieMatric(a, b), dz2.UmnoohenieMatric((dz2.VichitanieMatric(a, b)), a)), 3));

    }


    private static void Dz3() {
        Point p1 = new Point(0, 3);
        System.out.println("( " + p1.getX() + ", " + p1.getY() + " )");

        Point p2 = new Point(4, 0);
        System.out.println("( " + p2.getX() + ", " + p2.getY() + " )");

        System.out.println("Длинна стороны = " + Math.sqrt(Math.pow((p2.getX()-p1.getX()),2)+Math.pow((p2.getY()-p1.getY()),2)));
        //System.out.println(figs.CalculateSideLength(p1, p2)); //или так, ну я там хоть формулу написал ...


        System.out.println();
        System.out.println();

        Point p3 = new Point(0, 0, "Line");
        System.out.println(p3.getTitle() + "( " + p3.getX() + ", " + p3.getY() + " )");
        System.out.println(p3.toString());


        Figure figs = new Figure("Triangle", p1, p2, p3);
        System.out.println(figs.CalculateSideLength(p1, p2));
        System.out.println();
        System.out.println();
        System.out.println(figs.toString());
        System.out.println(figs.CalculatePerimeter());
        System.out.println();
        System.out.println();

        Figure square = new Figure("Square", new Point(0, 0, "A"), new Point(0, 2,"B"), new Point(2, 2, "C"), new Point(2, 0, "D"));
        System.out.println(square.toString());
        System.out.println("Perimeter: " + square.CalculatePerimeter());

    }

}
