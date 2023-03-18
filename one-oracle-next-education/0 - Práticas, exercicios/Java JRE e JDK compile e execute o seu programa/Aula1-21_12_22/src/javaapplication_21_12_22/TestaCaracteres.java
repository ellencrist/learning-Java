/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication_21_12_22;

/**
 *
 * @author ielle
 */
public class TestaCaracteres {
    public static void main (String[]args){
        char letra =  'a';//guarda um unico caracter
        System.out.println(letra);
        
        char valor = 66;//guarda números e converte em letras presentes na tabela
        System.out.println(valor);
        
        //um char cabe em um int, mas um int não cabe em um char
        valor =(char) (valor+1);
        System.out.println(valor);
        
        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);
        
        //soma de numeros com caracteres
        palavra = palavra + 2020;
        System.out.println(palavra);
    
    }
}
