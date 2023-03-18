/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytecode.encapsulado;

/**
 *
 * @author ielle
 */
public class TestaValores {
    public static void main(String[] args) {
        int total = 0;
        Conta conta = new Conta(1337, 24226);
        
        //conta esta inconsistente a regra de negocio
        // conta.setAgencia(-50);
        // conta.setNumero(-335);
        System.out.println(conta.getAgencia());
        
        conta.setAgencia(1232123);
       
        Conta conta2 = new Conta(1337, 17283);
        Conta conta3 = new Conta(1337, 65731);
        //só se tiver publico: System.out.println(Conta.total);
     
        System.out.println(Conta.getTotal());
     
    }
}
