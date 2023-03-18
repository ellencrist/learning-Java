package java_aula05_10_22;

import java.util.ArrayList;
public class Java_aula05_10_22 {

    
    public static void main(String[] args) {
    //instanciar arrasy list
    ArrayList<String> names;
    
    // declarar uma arraylist de strig somente
    names = new ArrayList();
    
    //ADICIONAR ITENS
    names.add("Ana");
    names.add("Felipe");
    names.add("Veronica"); 
    names.add(2,"Gustavo");
    names.add("Aline");
    names.add("Pedro");
    names.add("Ellen");
    names.add("Mateus");
    names.add("Alice");
    names.add("Joao");
    names.add("Paulo");
    
    //recupeação de um valor
    String str = names.get(0);
    //System.out.println(str);
    
    //remover itens
    //1 maneira de remover
    //remove veronica
    names.remove(0);
    System.out.println(names);
    
    //2 maneira de remover
    //.size()retorna o número de eleentos da list
    
    names.remove(names.size() - 1);
    System.out.println(names);
   
    //3 maneira de fazer
    //remove gustavo 
    names.remove("Gustavo");
    //exibe lista
    System.out.println(names);
    
    
    
    }
    
}