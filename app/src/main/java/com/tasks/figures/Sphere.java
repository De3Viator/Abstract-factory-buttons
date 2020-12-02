package com.tasks.figures;

public class Sphere implements Function {
    double R;


    @Override
    public void createArea() {
        double S = 4*Math.PI * Math.pow(R,2);
        System.out.println("Your area =" + S);

    }

    @Override
    public void createVolume() {
        double V = 4/3 * Math.PI * Math.pow(R,3);
        System.out.println("Your volume" + V);

    }
}
