import java.util.Scanner;
  public class Div23 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num=teclado.nextInt();

    if (num%2==0){
      System.out.println("El número es divisible por 2");
    }else{
      System.out.println("El número no es divisible por 2");
    }

    if (num%3==0){
      System.out.println("El número es divisible por 3");
    }else{
      System.out.println("El número no es divisible por 3");
    }
    
    
    teclado.close();
  }
}