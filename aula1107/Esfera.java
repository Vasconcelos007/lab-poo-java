package lab02;


public class Esfera {

    public static void main(String[] args) {
        var raio = Float.parseFloat(args[0]);
        var r = Math.pow(raio, 3);
        var volume =( (4 * 3.14 * r) / 3 );

        System.out.println("o volume da esfera é: " + volume );


        

    }
}