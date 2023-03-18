/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication_21_12_22;

/**
 *
 * @author ielle
 */
public class TestaEscopoDeVariaveis {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade =20;
      
        int quantidaddePessoas = 3;
        boolean acompanhado;
        
        //boolean acompanhado = quantidadePessoas >= 2;
        if(quantidaddePessoas >=2){
            acompanhado =true;
        }else{
           acompanhado = false;
        }
        
        
        if(idade >= 18 && acompanhado){

            System.out.println("seja bem vindo!");
        }else{
           System.out.println("infelizmente voce nao pode entrar");
            }
 
    }
}
