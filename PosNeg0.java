import java.util.Scanner;
  public class PosNeg0 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num= teclado.nextInt();
  
    if (num<0){
      System.out.println("El número es negativo");
    } else{
        if(num==0){
        System.out.println("El número es cero");
      } else{
        System.out.println("El número es positivo");
      }
    }
    teclado.close();
  }
}