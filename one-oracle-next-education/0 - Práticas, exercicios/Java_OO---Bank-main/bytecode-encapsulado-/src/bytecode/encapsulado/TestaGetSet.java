/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytecode.encapsulado;

public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        //conta.numero = 1337
        //conta.setNumero(1337);
        System.out.println(conta.getNumero());
         
        //conta.titular = paulo;
        Cliente jean = new Cliente(); 
        jean.setNome("Jean jr");

        conta.setTitular(jean);
        
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("programador php");        
    }

}
