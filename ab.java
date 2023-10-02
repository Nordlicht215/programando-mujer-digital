import java.util.Scanner;
  public class ab {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese una palabra: ");
    String word=teclado.nextLine();
  
    if (word.contains("a") && word.contains("b")){
      System.out.println("La palabra tiene a y b");
    } else{
      System.out.println("La plabra no contiene a y b");
    }
    
    teclado.close();
  }
}