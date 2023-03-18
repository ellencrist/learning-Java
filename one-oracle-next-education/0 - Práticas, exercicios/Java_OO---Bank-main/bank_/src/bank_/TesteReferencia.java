/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_;

/**
 *
 * @author ielle
 */
public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
    
        System.out.println("saldo da primeira: "+primeiraConta.saldo);
        
        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta "+segundaConta.saldo);
    
        segundaConta.saldo =+100;
        
        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);
    
        if(primeiraConta == segundaConta) {
            System.out.println("e a mesma conta");                    
        } else{
            System.out.println("contas diferentes");
        }
        
        
    }
     
    
}
   
