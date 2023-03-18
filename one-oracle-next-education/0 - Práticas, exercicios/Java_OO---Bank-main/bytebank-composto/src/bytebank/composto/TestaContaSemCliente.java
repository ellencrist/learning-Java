/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.composto;

/**
 *
 * @author ielle
 */
public class TestaContaSemCliente {
    public static void main(String[] args) {
           Conta contaDaEllen =  new Conta();
           System.out.println(contaDaEllen.getSaldo());
           
           contaDaEllen.titular =  new Cliente();
           System.out.println(contaDaEllen.titular);
       
          contaDaEllen.titular.nome =  "Ellen";
          System.out.println(contaDaEllen.titular.nome);
          
    }
}
