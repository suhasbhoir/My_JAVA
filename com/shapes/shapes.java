package com.shapes;

class Circle{
    float a;
    float r;
    float c;
    float area(float r){
        this.a= (float) (Math.PI*r*r);
        return this.a;
    }
    float radius(float c){
        this.r = (float) (c/2*Math.PI);
        return this.r;
    }
    float circumference(float r){
        this.c = (float) (2*Math.PI*r);
        return this.c;
    }
}
class Square{
    float A;
    float a;
    float e;
    float u;
    float area(float a){
        this.A = a*a;
        return this.A;
    }
    float Diagonal(float a){
        this.e = (float) (a*Math.sqrt(2));
        return this.e;
    }
    float Perimeter(float a){
        this.u = 4*a;
        return this.u;
    }

}
class shapes1 {
    public static void main(String[] args) {
        Circle user1=new Circle();
        System.out.println(user1.area(4));
    }
}
