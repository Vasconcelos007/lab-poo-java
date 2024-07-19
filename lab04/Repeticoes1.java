package lab04;

import java.util.Scanner;

public class Repeticoes1 {
    // java lab04/Repeticoes1.java
    public static void main(String[] args) {
       var contador = 1;
       Scanner sc = new Scanner(System.in);
       System.out.println("diga um numero: ");
       var numero = sc.nextInt();
       while (contador < 10) {
        System.out.println(numero + " X " + contador );
        System.out.println(numero * contador);
        contador +=1;
       }
    }
}
