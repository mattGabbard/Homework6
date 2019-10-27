
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0749489
 */
public class Numbers_Main {
    public static void main(String[] args) {
        
        int[] array = new int[100];
        
        for (int i=0;i<array.length;++i) {
            Random rand = new Random();
            array[i]=rand.nextInt(100);
        }
        
        Numbers num = new Numbers();
        num.setArray(array);
        System.out.println("Total is: " + num.getTotal());
        System.out.println("Average is: " + num.getAverage());
        System.out.println("Highest is: " + num.getHighest());
        System.out.println("Lowest is: " + num.getLowest());
    }
}
