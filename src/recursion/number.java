/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author manuel
 */
public class number {
    public float number;
    public float initialValueStoreer;
/**
 * 
 * @param number serves as the base to which the meathods will raise
 * the initial Val Storer will save the first value of 
 * number so that inside of the loop it can do the correct multiplication
 */
    public number(float number) {
        this.number = number;
        initialValueStoreer=number;
    }

    /**
     * 
     * @param raiseTo is the number of times that the base number from the constructor will be multiplied by itself
     * @return the number after it has been raised to the given power
     */
    public float powerCal(float raiseTo){
       long start= System.nanoTime();
        if(raiseTo==1){
            return number;  
        }
        if(raiseTo>1){
            number=initialValueStoreer*number;
            powerCal(raiseTo-=1);
        }
    long end =System.nanoTime();
        long elapsedTime = end-start;
        System.out.println(elapsedTime+"nS"+" Have Elapsed");    
    return number;
    }
    
   /**
    * 
    * @param power the number we will raise the base from the constructor to
    * @return the resultant of number^power
    */ 
    public float powerCalLoop(int power){
        long start= System.nanoTime();
        if (power==0)
            return 1;
        if (power == 1)
            return number;
        if(power>1){
        for (int i=1; i<power;i++){
            number = initialValueStoreer*number;
        }}
        long end =System.nanoTime();
        long elapsedTime = end-start;
        System.out.println(elapsedTime+"nS"+" Have Elapsed");
        return number;
    }
    
}
