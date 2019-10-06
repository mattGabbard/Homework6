/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
public class Circle {
    
    private double radius;
    private final double pi = 3.14159;
    private double area;
    private double diameter;
    private double circumference;
    
    public void Draw (double radius) {
        this.radius = radius;
    }
    
    public void Draw() {
        this.radius = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        area = pi * radius * radius;
        return area;
    }
    
    public double diameter() {
        diameter = radius * 2;
        return diameter;
    }
    
    public double circumference() {
        circumference = 2 * pi * radius;
        return circumference;
    }
    
}
