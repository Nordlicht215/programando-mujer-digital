import java.util.Scanner;
  public class Num50100 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num=teclado.nextInt();

    if (num<50){
      System.out.println("El número es menor que 50");
    } else{
      System.out.println("El número no es menor que 50");
    }
    if (num>100){
      System.out.println("El número es mayor que 100");
    }else{
      System.out.println("El número no es mayor que 100");
    }
    
    teclado.close();
    
  }
}