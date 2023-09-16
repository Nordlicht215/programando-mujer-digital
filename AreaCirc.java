import java.util.Scanner;
  public class AreaCirc {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la medida del radio: ");
    float radio=teclado.nextFloat();
 
    double area= radio*radio*3.141592;
    System.out.println("El área es: " + area );
    teclado.close();
;  }
}