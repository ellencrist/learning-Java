/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication_21_12_22;

/**
 *
 * @author ielle
 */
public class TestaCoversao {
    public static void main(String[] args) {
        double salario = 2250.50;
        int valor = (int)salario;
        System.out.println(valor);
        
        float pontoFlutuante = 3.14f;
        long numeroGrande = 3332443427L;
        //int pode guardar até dois milhões, para números maiores que isso deve-se usar long
        //short guarda valores de 16 bits
        //byte pode guardar até 127 números
    
           double valor1 = 0.2;
           double valor2 = 0.1;
           double total = valor1+valor2;
           System.out.println(total);
        
    
    }
}
