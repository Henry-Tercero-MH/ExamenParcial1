import java.util.Scanner;

public class Ejercicio2LeeUnNombre {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaro variables
        String nombreCompleto;
        String nombre = " ";
        String apellido ;
        String letra;
        System.out.println("Digite un nombre y un apellido");
       nombreCompleto = leer.nextLine();
nombre = nombreCompleto.substring(5);
apellido= nombreCompleto.substring(5);

        System.out.println("Su nombre es: "+apellido+""+nombre);



    }
}
