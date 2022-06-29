/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_05;

/**
 * Escreva um programa que inverta os caracteres de um string.
 *
 * @author Kevin Fernando
 */
public class Exercicio_05 {
    public static void main(String args[]) {
        String str = "Kevin";
        System.out.println(str);
        String str_invertida = reverteString(str, str.length()-1);
        System.out.println(str_invertida);
    }
    
    public static String reverteString(String str, int index) {
        if(index == 0)
            return str.charAt(0) + "";
        
        char letra = str.charAt(index);
        return letra + reverteString(str, index-1);
    }
}
