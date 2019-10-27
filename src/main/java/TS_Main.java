
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
public class TS_Main {
    public static void main(String[] args) {
        
    double[] array = new double[100];

        for (int i=0;i<array.length;++i) {
            Random rand = new Random();
            array[i]=rand.nextDouble();
        }
        TestScores testScores = new TestScores();
        testScores.setArray(array);
        
        try {
        testScores.getAverage();
        }
        catch (TestScores.InvalidTestScoreException e) {
            e.printStackTrace();
        }
    }
}