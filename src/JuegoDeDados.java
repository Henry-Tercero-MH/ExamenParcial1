import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class JuegoDeDados {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b;
        int op;
int suma=0;



            Random dadoA = new Random();
            Random dadoB = new Random();
            System.out.println("Lanza Los Dados presionando 1");
            op = leer.nextInt();
            if (op == 1) {
                a = dadoA.nextInt(6);
                System.out.println("Dado A: " + a);
                b = dadoB.nextInt(6);
                System.out.println("Dado B: " + b);
                //sumando los valores de los dados
                suma = a + b;
                System.out.println("Suma de los dados: " + suma);
            } else if (op != 1) {
                System.out.println("Ingrese 1 para tirar los dados");

            }




    }
}
