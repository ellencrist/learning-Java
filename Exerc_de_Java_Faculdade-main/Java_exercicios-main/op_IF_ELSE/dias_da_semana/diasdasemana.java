package javaapplication6;
import java.util.*;
import java.util.Scanner;

public class newJavaFile6 {
    public static void main(String args[]) {
         int diaSemana, resp;
        
        Scanner imput = new Scanner(System.in);
        do{
       System.out.print("Digite o dia da Semana: ");
       diaSemana = imput.nextInt();
       resp=0;
      
        if(diaSemana==1){
            System.out.println("Domingo");
        }else if(diaSemana==2){
        System.out.println("Segunda");
        }else if(diaSemana==3){
        System.out.println("Terça");
        }else if(diaSemana==4){
        System.out.println("Quarta");
        }else if(diaSemana==5){
        System.out.println("Quinta");
        }else if(diaSemana==6){
        System.out.println("Sexta");
        }else if(diaSemana==7){
        System.out.println("Sabádo");
        }
        else if((diaSemana <1) || (diaSemana >7)){
        System.out.println("Número inválido fornecido, use números de 1 até 7");
        }
        System.out.println("Digite 0 parar: ");
        resp=imput.nextInt();
        }while(resp!=0);
        imput.close();
    }
}