/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytecode.encapsulado;

import javax.print.attribute.SetOfIntegerSyntax;

public class Conta {
        private double saldo;
        int agencia;
        int numero;
        Cliente titular;
        private static int total;
        // atributos, método deposita, método saca, método transfere, método pegaSaldo
        
        public Conta(){
            Conta.total++;
            System.out.println("o total de contas é "+ Conta.total);
            this.agencia = agencia;
            this.numero = numero;
            System.out.println(" eu estou criando uma conta: " + this.numero);
        }
        
        public Conta(int agencia, int numero){
            this.agencia = agencia;
            this.numero = numero;
            System.out.println("estou criando uma conta"+ this.numero);
        }
         
    void deposita(double valor){
        if(agencia <=0){
            System.out.println("não pode valor menor ou igual a zero");
            return;
        } 
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
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
    if(numero <=0){
        System.out.println("não pode numero menor ou igual a zero");
        return;
    }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    
    public static int getTotal(){
        return Conta.total;
    }
    
    
}
