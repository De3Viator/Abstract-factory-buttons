package com.tasks.figures;

public class Cylinder implements Function {
    double R = 15;
    double h =10;


    @Override
    public void createArea() {
        double S = 2 * Math.PI * R * (R + h);
        System.out.println("Your area = " + S);


    }

    @Override
    public void createVolume() {
        Double V = Math.PI * Math.pow(R, 2) * h;
        System.out.println("Your volume = " + V);
    }

    }



