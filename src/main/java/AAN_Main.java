
import java.util.Random;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0749489
 */
public class AAN_Main {
    public static void main(String[] args) {
        
        int[] array = new int[100];
        int testValue = 5;
    
        for(int i=0;i<=array.length-1;i++) {
            Random rand = new Random();
            array[i] = rand.nextInt(10);
        }
    
    ArrayAndNumber aan = new ArrayAndNumber();
    System.out.println("Result is: " + aan.CheckNumbers(array, testValue));
    }
}