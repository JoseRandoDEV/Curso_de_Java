import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] palabras = {"Jose","Laura","Milo","Gael","Nieve","Cloe" };
        String[] productos = new String[7];

        productos[0] = "Kingstone Pendrive 64Gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromcast 4ta generación";
        productos[6] = "Bicicleta Oxfiord";

        // ORDENAR EL ARREGLO
        Arrays.sort(productos);
        //Arrays.sort(palabras);

        // ITERAR EL ARREGLO
        for (String producto:productos)
        {
            System.out.println("producto = " + producto);
        }

        for (String palabra:palabras)
        {
            System.out.println("Nombres = " + palabra);
        }

        // BUSCAR EN ARREGLOS
        Scanner buscar = new Scanner(System.in);
        System.out.println("Ingrese el Valor a Buscar: ");

        String valorBuscado = buscar.next();

        int pos;
        for (pos=0; pos< palabras.length && !palabras[pos].equalsIgnoreCase(valorBuscado); pos++)
        {}
        if (pos == palabras.length)
        {
            System.out.println("Nombre NO encontrado...");
        }else{
            System.out.println("Palabras[pos]= " + palabras[pos]);
            System.out.println("pos = " + pos);
        }

        // MODIFICAR EL VALOR DE UN ARREGLO

        for (int i=pos ; i< palabras.length-1; i++)
        {
            palabras[i] = palabras[i+1];
        }
        for (String palabra:palabras)
        {
            System.out.println("Nombres = " + palabra);
        }
        String [] nuevo = new String[palabras.length-1]; //SOLUCION DEL PROBLEMA REPITE UN ARREGLO
        System.arraycopy(palabras,0,nuevo,0,nuevo.length);
        System.out.println();

        for (String p:nuevo)
        {
            System.out.println("Palabras = " + p);
        }
    }
}