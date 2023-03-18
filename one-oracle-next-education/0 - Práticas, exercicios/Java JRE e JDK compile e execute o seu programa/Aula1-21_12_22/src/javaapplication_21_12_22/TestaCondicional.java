/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication_21_12_22;

import javax.swing.JOptionPane;

/**
 *
 * @author ielle
 */
public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade =16;
        int quantidadePessoas = 3;
        
        if(idade >= 18){
            System.out.println("voce tem mais de dezoito anos");
            System.out.println("seja bem vindo!");
        }else{
            if(quantidadePessoas >= 2){
                System.out.println("voce nao tem 18 mas pode entrar pois esta acompanhado");
            }else{
            System.out.println("infelizmente voce nao pode entrar");
            }
            
        }
        
        
    
    
    }
}
