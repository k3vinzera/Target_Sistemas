/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_02;

import java.util.Scanner;

/**
 * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor 
 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13
 * , 21, 34...), escreva um programa na linguagem que desejar onde, informado um
 * número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando 
 * se o número informado pertence ou não a sequência.
 *
 * @author Kevin Fernando
 */
public class Exercicio_02 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        
        for(int cont = 0; cont <= numero; cont++) {
            int fibonacciNum = calcularFibonacci(cont);
            System.out.println(" " + fibonacciNum);
        }
        
        System.out.println(verificaNumero(numero));
    }
    
    public static int calcularFibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
    
    public static String verificaNumero(int n) {
        String resposta = "";
        
        if(calcularFibonacci(n) == n) 
            resposta = "O número " + n + " está presente na sequência";
        else
            resposta = "O número " + n + " não está presente na sequência";
        
        return resposta;
    }
}