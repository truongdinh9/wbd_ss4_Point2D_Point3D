package com.codegym;

public class App {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point2D point2D1 = new Point2D(1.5f, 2);
        System.out.println(point2D.toString());
        System.out.println(point2D1.toString());
        Point3D point3D=new Point3D(2.5f);
        Point3D point3D1=new Point3D(2.3f,2.4f,2.5f);
        System.out.println(point3D);
        System.out.println(point3D1);


    }

}
