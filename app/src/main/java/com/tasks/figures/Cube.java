package com.tasks.figures;

public class Cube implements Function {
    int a;



    @Override
    public void createArea() {
       int S = (int) (6 *Math.pow(a,2));
       System.out.println("Your area = " + S);

    }

    @Override
    public void createVolume() {
        int V = a * a * a;
        System.out.println("Your volume = " + V);

    }


}
