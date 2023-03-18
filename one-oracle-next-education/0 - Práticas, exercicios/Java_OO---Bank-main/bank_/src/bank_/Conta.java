/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_;

/**
 *
 * @author ielle
 */
public class Conta {
        double saldo;
        int agencia;
        int numero;
        String titular;

        
        void deposita(double valor){
           this.saldo = this.saldo += valor;
        }
                
  
   public boolean saca(double valor){
       if(this.saldo >= valor){
           this.saldo -= this.saldo - valor;
           return true;
       
       }else{
           return false;
       }
   }
   
    public boolean transfere(double valor, Conta destino ){
        if(this.saldo >= valor){
        this.saldo -=valor;
        destino.saldo +=valor;
        destino.deposita(valor);
        return true;
     }
        return false;
  }
}
