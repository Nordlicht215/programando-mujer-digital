import java.util.Scanner;
  public class Primo100 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int num=teclado.nextInt();
    int div=0;

    if (num>100){
      System.out.println("El número es mayor a 100");
    } else{
      for (int i=1; i<num; i++){
        if (num%i==0){
          div++;
        }
      }
      if (div>2){
        System.out.println("El número no es primo");
      }else{
        System.out.println("El número es primo");
      }
    }
         
    
    teclado.close();
    
  }
}