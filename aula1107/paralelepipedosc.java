 package aula1107;
 import java.util.Scanner;

 public class paralelepipedosc {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("informe o comprimento: ");
        var comprimento = sc.nextInt();
        System.out.println("informe a largura:  ");
        var largura = sc.nextInt();
        System.out.println("informe a altura: ");
        var altura = sc.nextInt();

        var volume = comprimento * altura * largura; 

        System.out.println(" o volume é : " + volume);



        
    }

    
}