import java.util.Scanner;
  public class AreaTri {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la medida de la base de un triángulo: ");
    float base=teclado.nextFloat();
    System.out.println("Ingrese la medida de la altura del triángulo: ");
    float altura=teclado.nextFloat();
    double area= base*altura*0.5;
    System.out.println("El área es: " + area );
    teclado.close();
;  }
}