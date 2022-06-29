/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_01;

/**
 * Observe o treco de código abaixo. Ao final do processamento, qual será o 
 * valor da variável SOMA?
 *
 * @author Kevin Fernando
 */
public class Exercicio_01 {
    public static void main(String args[]) {
        int indice = 13, soma = 0, k = 0;
        
        while(k < indice) {
            k++;
            soma += k;
        }
        
        System.out.println(soma);
        //O resultado exibido para a variável soma foi 91. 
    }
}