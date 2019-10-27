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
    private int total = 0;
    private int highest = 0;
    private int lowest = 100;
    
    public void setArray(int[] array) {
        
        this.array = array;
    }
    
    public int getTotal(){
    
        for (int i=0;i<array.length;++i){
            total += array[i];
        }
        return total;
    }
    
    public int getAverage(){
    
        for (int i=0;i<array.length;++i){
            total += array[i];
        }
        return total/array.length;
    }
    
    public int getHighest(){
    
        for (int i=0;i<array.length;++i){
            if (array[i]>highest) {
                highest = array[i];
            }   
        }
        return highest;
    }
    
     public int getLowest() {
    
        for (int i=0;i<array.length;++i){
            if (array[i]<lowest) {
                lowest = array[i];
            }   
        }
        return lowest;
    }
}
