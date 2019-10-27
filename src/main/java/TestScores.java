/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */
public class TestScores {
    
    private double[] array;
    private double total;
    private double average;

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }
    
    public double getAverage() throws InvalidTestScoreException {
        
         for (int i=0;i<array.length;++i){
             if (array[i] < 100 || array[i] > 0) {
             throw new InvalidTestScoreException("Score out of bounds. Try again. ");
            }
             
            total += array[i];
        }
        average = total/array.length;
        return average;
    }
    
    public class InvalidTestScoreException extends Exception {
        
        public InvalidTestScoreException(String errorMessage) {
            super(errorMessage);
        }
    }
}

