/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_;

/**
 *
 * @author ielle
 */
public class TestaMetodo {
    public static void main(String[]args){
        Conta contaDaniel = new Conta();
        contaDaniel.saldo = 100;
        contaDaniel.deposita(50);
        System.out.println(contaDaniel.saldo);
                
                
        boolean conseguiuRetirar = contaDaniel.saca(20);
        System.out.println(contaDaniel);
        System.out.println(conseguiuRetirar);
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        
        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaniel);
        if(sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");

        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDaniel.saldo); 
        
        contaDaniel.titular = "daniel santos";
        System.out.println(contaDaniel.titular);
        //contaDaMarcela.transfere(300, contaDaniel);
        //System.out.println(contaDaMarcela.saldo);
        //System.out.println(contaDaniel);
     
    }
}
