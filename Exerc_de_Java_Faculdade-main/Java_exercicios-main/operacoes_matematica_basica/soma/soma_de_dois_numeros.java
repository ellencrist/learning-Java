public static void main(String[] args){
        package javaapplication5;
        import java.util.Scanner;
/**
 *
 * @author ellencrist
 */
//Método principal inicia a execução do app Java
public class JavaApplication5
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criar scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(system.in);
        input = new Scanner(system.in);

        int num1;//primeiro número a somar;
        int num2;//primeiro número a somar;
        int soma;//soma de num1 e num2;

        System.out.println("Entre com o primeiro número: ");//prompt
        num1 = input.nextInt();//lê o primeiro número fornecido pelo usuário
        System.out.println("Entre com o segundo número: ");//prompt
        num2 = input.nextInt();//lê o segundo número fornecido pelo usuário

        soma = num1 + num2; //soma os números
        System.out.println("A soma é:" + soma);//exibe a soma

        //Fim do Método principal
    }

}

}