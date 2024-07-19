 package lab02;


 public class Pv {

    public static void main(String[] args) {
      var lado = Float.parseFloat(args[0]);
      var altura = Float.parseFloat(args[1]);
      var volume = (lado * lado * altura / 3);

      System.out.println("o volume da pirâmide é " + Math.round(volume));


        }
}