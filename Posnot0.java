import java.util.Scanner;
  public class Posnot0 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número: ");

    float num=teclado.nextFloat();
    if (num>0){
      System.out.println("El número es positivo y distinto a 0");
    }else{
      System.out.println("El número es negativo o es 0");
    }
    
    teclado.close();
  }
}