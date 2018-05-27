/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ruben
 */
public class Factorial {

    public static double getAcumulado(double num) {
      
        if(num<=0)
            return 1;
       
        else{
          
        return num*getAcumulado(num-1);
        }
}

}