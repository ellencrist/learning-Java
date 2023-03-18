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
    double jardas,pes,milhas,polegadas;

	System.out.println("Coloque a medida em pés");
	
	pes = sc.nextint();
	
	jardas = pes*3;
	milhas = jardas*1.76;
	polegadas = pes*12;

	System.out.pintln("Sua conversão de pés é: " + pes);
	System.out.println("Jardas:" + jardas);
	System.out.println("Milhas:" + milhas);
	System.out.println("Polegadas:" + polegadas);
        } 
    }
    
}