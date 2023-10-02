import java.util.Scanner;
  public class Div3not5 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num=teclado.nextInt();

    if (num%3==0){
      System.out.println("El número es múltiplo de 3");
    }else{
      System.out.println("El número no es múltiplo de 3");
    }

    if (num%5==0){
      System.out.println("El número es múltiplo de 5");
    }else{
      System.out.println("El número no es múltiplo de 5");
    }
    
    
    teclado.close();
  }
}