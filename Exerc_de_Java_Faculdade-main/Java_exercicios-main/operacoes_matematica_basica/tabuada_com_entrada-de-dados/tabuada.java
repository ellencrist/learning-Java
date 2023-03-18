package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author ellencrist
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int cont, tabuada, resultado;
    resultado = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("digite qual tabuada você quer calcular?");
    tabuada = input.nextInt();
    System.out.println("");
    
    for(cont=1;cont<=10;cont++){
            resultado = tabuada * cont;
            System.out.println(tabuada + "X" + cont + " = " + resultado);
        } 
    }
    
}