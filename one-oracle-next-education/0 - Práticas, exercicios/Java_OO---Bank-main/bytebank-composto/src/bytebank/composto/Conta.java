/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.composto;

/**
 *
 * @author ielle
 */
public class Conta {
        private double saldo;
        int agencia;
        int numero;
        Cliente titular;

        
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

    public double getSaldo(){
       return this.saldo;
       
   }
}
