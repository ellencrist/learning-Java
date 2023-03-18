package javaapplication6;
import java.util.*;
import java.util.Scanner;

public class newJavaFile6 {
    public static void main(String args[]) {
         int diaMes, resp;
        
        Scanner imput = new Scanner(System.in);
        //looping
        do{
       System.out.print("Digite o dia do Mês: ");
       diaMes = imput.nextInt();
       resp=0;
      
       switch(diaMes){
           case 1:
               System.out.println("Janeiro");
               break;
           case 2:
               System.out.println("Fevereiro");
               break;
           case 3:
               System.out.println("Março");
               break;
           case 4:
               System.out.println("Abril");
               break;
           case 5:
               System.out.println("Maio");
               break;
           case 6:    
                System.out.println("Junho");
                break;
           case 7:
               System.out.println("Julho");
               break;
            case 8:
               System.out.println("Agosto");
               break;
           case 9:
               System.out.println("Setembro");
               break;
           case 10:
               System.out.println("Outubro");
               break;
           case 11:
               System.out.println("Novembro");
               break;   
            case 12:
               System.out.println("Dezembro");
               break;     
           default:
               System.out.println("Número inválido fornecido, use números de 1 até 12");
               break;
       }
       
        resp=imput.nextInt();
        }while(resp!=0);
        imput.close();
    }
}