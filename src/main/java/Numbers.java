/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0749489
 */
public class Numbers {
 
    private int[] array;
    private int total=0;
    private int highest;
    private int lowest;
    
    public int getTotal(int[] array){
    
        for (int i=0;i<array.length;++i){
            total+=array[i];
        }
        return total;
    }
    
    public int getAverage(int[] array){
    
        for (int i=0;i<array.length;++i){
            total+=array[i];
        }
        return total/array.length;
    }
    
    public int getHighest(int[] array){
    
        for (int i=0;i<array.length;++i){
            if (array[i]>highest) {
                array[i]=highest;
            }   
        }
        return highest;
    }
    
     public int getLowest(int[] array){
    
        for (int i=0;i<array.length;++i){
            if (array[i]<lowest) {
                array[i]=lowest;
            }   
        }
        return lowest;
    }
}
