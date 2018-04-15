package com.company;

public class DomZad1 {
    private double Chisl = 0.0, Znam = 0.0;


    public double getChisl() {
        return Chisl;
    }

    public void setChisl(double chisl) {
        Chisl = chisl;
    }

    public double getZnam() {
        return Znam;
    }

    public void setZnam(double znam) {
        Znam = znam;
    }


    public double PlusRezult(double a1, double a2, double a3, double b1, double b2, double b3) {
        double res = 0;
        res = a1 / b1 + a2 / b2 + a3 / b3;
        return res;
    }
    public double MinusRezult(double a1, double a2, double a3, double b1, double b2, double b3) {
        double res = 0;
        res = a1 / b1 - a2 / b2 - a3 / b3;
        return res;
    }
    public double MultyplyRezult(double a1, double a2, double a3, double b1, double b2, double b3) {
        double res = 0;
        res = (a1 / b1) * (a2 / b2) * (a3 / b3);
        return res;
    }
    public double ReversePlusRezult(double a1, double a2, double a3, double b1, double b2, double b3) {
        double res = 0;
        res = 1/(a1 / b1 + a2 / b2 + a3 / b3);
        return res;
    }
    public double ReverseMinusRezult(double a1, double a2, double a3, double b1, double b2, double b3) {
        double res = 0;
        res = 1/(a1 / b1 - a2 / b2 - a3 / b3);
        return res;
    }
    public double ReverseMultyplyRezult(double a1, double a2, double a3, double b1, double b2, double b3) {
        double res = 0;
        res = 1/((a1 / b1) * (a2 / b2) * (a3 / b3));
        return res;
    }
}
