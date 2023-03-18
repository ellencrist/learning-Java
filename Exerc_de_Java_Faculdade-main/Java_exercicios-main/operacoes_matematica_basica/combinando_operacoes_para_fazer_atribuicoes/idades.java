/******************************************************************************

17/08/22

*******************************************************************************/
import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
        int num1 = 31;
    int num2 = 5;
    int Sum = num1 + num2;
    int diff = num1-num2;
    int prod = num1*num2;    
    double quot = num1/num2;
        
    num1 = 31;
    num2 = 5;
    quot = num1/num2;
    prod = num1*num2;
    diff = num1-num2;
    Sum = num1 + num2;
        
        System.out.println("a divisão é: "+ quot);
        
        //multiplicação
         System.out.println("a multiplicação é: "+ prod);
         
        //subtração
         System.out.println("a subtração é: "+diff);

         //soma
         System.out.println("a soma é: "+ Sum);
        
        //PARTE 2 ATRIBUIÇOES
        int a = 6;
        int b = 2;
        int result = a+=b;
      
      a = 6;
     int result1 = a*=b;
      
      a = 6;
     int result2 = a/=b;
      
      a = 6;
      int result3 = a-=b;
        
      a = 6;
      int result4 = a%=b;
      
        //som
        System.out.println("PARTE 2: a soma é "+result);
        
        //multi
        System.out.println("PARTE 2: a multi é "+result1);
        
        //div
        System.out.println("PARTE 2: a div é "+result2);
        
        //sub
        System.out.println("PARTE 2: a sub é "+result3);
        
        //sub
        System.out.println("PARTE 2: o resto é "+result4);
        
        //PARTE 3
        //pré acréscimo
        int age = 6;
        System.out.println("a idade é: "+ age+" a newage é: "+ ++age);
        
        
        //pós acréscimo
        age = 9;
        System.out.println(" a new age é: " + age++ +"a idade é: "+age);
        
        //pré decréscimo
    
	    
	}
}
