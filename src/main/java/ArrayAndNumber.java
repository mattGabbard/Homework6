/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0749489
 */
public class ArrayAndNumber {
    
    private int[] array;
    private int testValue;
    private String returnValues = "Returned values: ";
    
    public String CheckNumbers(int [] array, int testValue) {
        
        for (int i=0;i<array.length;++i) {
            if (array[i]>testValue) {
               returnValues+=array[i] + ", ";
            }
        }
        return returnValues;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getTestValue() {
        return testValue;
    }

    public void setTestValue(int testValue) {
        this.testValue = testValue;
    }
}