import java.util.Scanner;
  public class Calif {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un nombre: ");
    String nombre= teclado.nextLine();
    System.out.println("Ingrese una calificación: ");
    float calif=teclado.nextFloat();

    if (calif<0 || calif>100){
      System.out.println("Calificación no válida");
    }else{
      if (calif<60){
        System.out.println(nombre + ": Reprobadx, pero puedes esforzarte más, tú puedes <3");
    } else{
        System.out.println(nombre + ": Aprobadx, muchas felicidades, el esfuerzo se vio recompensado <3");
      }
    }
    
    teclado.close();
  }
}