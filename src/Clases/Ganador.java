/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ganador {
    
    public String Winner(char ps1,char ps2,char ps3,char ps4,char ps5,char ps6,char ps7,char ps8,char ps9){
        String ganador=null;
                 // Jugador 1
                // Horizontales
                if(ps1=='X' && ps2=='X' && ps3=='X'){
                    ganador="Jugador 1";
                }
                if(ps4=='X' && ps5=='X' && ps6=='X'){
                    ganador="Jugador 1";
                }
                if(ps7=='X' && ps8=='X' && ps9=='X'){
                    ganador="Jugador 1";
                }
                // Diagonal
                if(ps1=='X' && ps5=='X' && ps9=='X'){
                    ganador="Jugador 1";
                }
                if(ps3=='X' && ps5=='X' && ps7=='X'){
                    ganador="Jugador 1";
                }
                // Verticales
                if(ps1=='X' && ps4=='X' && ps7=='X'){
                    ganador="Jugador 1";
                }
                if(ps2=='X' && ps5=='X' && ps8=='X'){
                    ganador="Jugador 1";
                }
                if(ps3=='X' && ps6=='X' && ps9=='X'){
                    ganador="Jugador 1";
                }
                
                // Jugador 2
                if(ps1=='O' && ps2=='O' && ps3=='O'){
                    ganador="Jugador 2";
                }
                if(ps4=='O' && ps5=='O' && ps6=='O'){
                    ganador="Jugador 2"; 
                }
                if(ps7=='O' && ps8=='O' && ps9=='O'){
                    ganador="Jugador 2";
                }
                // Diagonal
                if(ps1=='O' && ps5=='O' && ps9=='O'){
                    ganador="Jugador 2"; 
                }
                if(ps3=='O' && ps5=='O' && ps7=='O'){
                    ganador="Jugador 2"; 
                }
                // Verticales
                if(ps1=='O' && ps4=='O' && ps7=='O'){
                    ganador="Jugador 2";
                }
                if(ps2=='O' && ps5=='O' && ps8=='O'){
                    ganador="Jugador 2"; 
                }
                if(ps3=='O' && ps6=='O' && ps9=='O'){
                    ganador="Jugador 2";
                }   
                return ganador;
    }
    
    
    
}
