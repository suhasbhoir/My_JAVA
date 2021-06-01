package com.shapes;

public class Square{
    float A;
    float a;
    float e;
    float u;
    public float area(float a){
        this.A = a*a;
        return this.A;
    }
    public float Diagonal(float a){
        this.e = (float) (a*Math.sqrt(2));
        return this.e;
    }
    public float Perimeter(float a){
        this.u = 4*a;
        return this.u;
    }

}
