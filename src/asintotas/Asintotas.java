/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asintotas;
import java.util.Scanner;
/**
 *
 * @author Osiris
 */
public class Asintotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Introdusca una palabra en minusculas");
        palabra = sc.nextLine();
        palabra = palabra.toLowerCase();
        char[] cosa = palabra.toCharArray();
        if (asintota(cosa)){
            System.out.println("La frase es asintota");
        }else{
            System.out.println("La frase no es asintota");
        }
    }
    
    public static boolean asintota (char[] cosa){
        Stack<Character> asi = new Stack();
        int i;
        for (i = 0; i < cosa.length; i++){
            if (cosa[i] != ' '){
                asi.push(cosa[i]);
            }
        }
        for (i = 0; i < cosa.length; i++){
            if (cosa[i] != ' '){
                if (cosa[i] != asi.pop()){
                    return false;
                }
            }
        }
        return true;
    }
}
