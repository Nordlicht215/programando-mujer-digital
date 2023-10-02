import java.util.Scanner;
  public class Par5 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num=teclado.nextInt();
    
    if (num%2==0){
      System.out.println("El número es par");
    }else{
      System.out.println("El número es impar");
    }
    
    if (num%5==0){
      System.out.println("El número es múltiplo de 5");
    }else{
      System.out.println("El número no es múltiplo de 5");
    }
    
    teclado.close();
  }
}