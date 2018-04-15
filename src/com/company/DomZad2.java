package com.company;

public class DomZad2 {
    public double[][] SlozhenieMatric(double a[][], double b[][]) {
        double res[][] = new double[a.length][b.length];
        for (int i = 0; i < (a.length >= b.length ? a.length : b.length); i++) {
            for (int j = 0; j < (a.length >= b.length ? a.length : b.length); j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }
    public double[][] VichitanieMatric(double a[][], double b[][]) {
        double res[][] = new double[a.length][b.length];
        for (int i = 0; i < (a.length >= b.length ? a.length : b.length); i++) {
            for (int j = 0; j < (a.length >= b.length ? a.length : b.length); j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    public double[][] UmnoohenieMatric(double a[][], double b[][]) {
        double res[][] = new double[a.length][b.length];
        for (int i = 0; i < (a.length >= b.length ? a.length : b.length); i++) {
            for (int j = 0; j < (a.length >= b.length ? a.length : b.length); j++) {
                res[i][j] = a[i][j] * b[i][j];
            }
        }
        return res;
    }

    public double[][] UmnoohenieMatricNaChislo(double a[][], double b) {
        double res[][]=a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = a[i][j] * b;
            }
        }
        return res;
    }

    public void printResult(double matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
