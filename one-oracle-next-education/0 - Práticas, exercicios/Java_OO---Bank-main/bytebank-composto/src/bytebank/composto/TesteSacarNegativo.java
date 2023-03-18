/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.composto;

/**
 *
 * @author ielle
 */
public class TesteSacarNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(200));
        System.out.println(conta.saca(101));
        
    //proibido
        //conta.saldo = conta.saldo -101;
        //System.out.println(conta.saldo);
        
        conta.saca(101);
        
        System.out.println(conta.getSaldo());
        
       // conta.numero = -90;
                
    }
}
