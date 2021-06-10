
import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        int edad, numAleatorio, nPar = 0, nImpar = 0, nCero = 0;
        String opc = "";
        Scanner scanner = new Scanner(System.in);

        do {
            numAleatorio = (int) (Math.random() * 100);
            if (numAleatorio % 5 == 0) {
                System.out.println(numAleatorio);
                System.out.println("Ingrese s si desea salir: ");
                opc = scanner.next();
            }

        } while (!opc.equals("s"));

    }
}
