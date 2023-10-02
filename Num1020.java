import java.util.Scanner;
  public class Num1020 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num=teclado.nextInt();

    if (num>10 && num<20){
      System.out.println("El número es mayor a 10 y menor a 20");
    } else{
      System.out.println("El número no es mayor a 10 ni menor a 20");
    }
    
    teclado.close();
    
  }
}