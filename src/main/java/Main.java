/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
public class Main {
    public static void main(String[] args) {
        
        int yearModel;
        String make;
        
        BuildCar carBuild = new BuildCar();
            carBuild.CarBuild(2014, "200");
            
        for(int i = 0; i < 5; i++) {
            carBuild.accelerate();
            System.out.println(carBuild.getSpeed());
        }
        
        for(int i = 0; i < 5; i++) {
            carBuild.brake();
            System.out.println(carBuild.getSpeed());
        }
        
    }
}
