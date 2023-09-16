import java.util.Scanner;
  public class ParImpar {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num= teclado.nextInt();
  
    if (num%2<1){
      System.out.println("El número es par");
    } else{
      System.out.println("El número es impar");
    }
    teclado.close();
  }
}