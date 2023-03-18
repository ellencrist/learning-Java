/******************************************************************************

faça um programa que receba um número positivo e maior que zero,calcule e mostre
o número digitado ao quadrado;
o número digitado ao cubo;
a raí quadrada
a raíz cúbica

ferramenta utilizada: GDB online debugger
*******************************************************************************/
import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
	    double x,q,c,r,rc;
	    Scanner e=new Scanner(System.in);
	    System.out.println("insira o número");
	    x= e.nextDouble();
	    q= x*x;
	    c= x*x*x;
	    r=Math.sqrt(x);
	    rc=Math.cbrt(x);
	    System.out.println("quadrado = "+q);
	    System.out.println("cubo"+c);
	    System.out.println("raiz = "+r);
	    System.out.println("raiz cubica = "+rc);
	    
	}
}
