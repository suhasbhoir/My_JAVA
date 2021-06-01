package com.shapes;

public class Circle {
    float a;
    float r;
    float c;

    public float area(float r) {
        this.a = (float) (Math.PI * r * r);
        return this.a;
    }

    public float radius(float c) {
        this.r = (float) (c / 2 * Math.PI);
        return this.r;
    }

    public float circumference(float r) {
        this.c = (float) (2 * Math.PI * r);
        return this.c;
    }
}
