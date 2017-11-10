/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Recursion {
      

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
     
        System.out.println("what base would you like for exponentiation using recursion");
        float base1=keyboard.nextFloat();
        number currentExperament = new number(base1);
        System.out.println("what base would you like for exponentiation using loops");
        float base2=keyboard.nextFloat();
        number currentExperament2 = new number(base2);
        
        
        System.out.println("what would you like to raise the first base by? (only real numbers less thatn 64)");
        int power1 =keyboard.nextInt();
        float valueRec=currentExperament.powerCal(power1);
        System.out.println(valueRec);
        System.out.println("what would you like to raise the second base by? (only real numbers less thatn 64)");
        int power2 =keyboard.nextInt();
        float valueLoop=currentExperament2.powerCalLoop(power2);
        System.out.println(valueLoop);
    }
    
}
