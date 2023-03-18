/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_;

/**
 *
 * @author ielle
 */
public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
    
        primeiraConta.saldo +=100;
        System.out.println(primeiraConta.saldo);
    
        Conta segundaConta =  new Conta();
        segundaConta.saldo = 50;
        
        System.out.println("primeira conta tem "+ primeiraConta.saldo);
        System.out.println("segunda conta tem "+segundaConta.saldo);
    
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        
        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta esta na agencia "+segundaConta.agencia);
    
    
    
    }   
        
}
