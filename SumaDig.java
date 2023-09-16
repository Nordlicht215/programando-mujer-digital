import java.util.Scanner;
  public class SumaDig {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num=teclado.nextInt();
    int sum=0;
    for (sum=0; num>0;sum += num % 10,num /= 10);
    System.out.println("La suma es: " + sum );
    teclado.close();
;  }
}