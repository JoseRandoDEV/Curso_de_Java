import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args)
    {
        List<String> arreglo = new ArrayList<>();
        arreglo.add("Jose");
        arreglo.add("Laura");
        arreglo.add("Milo");
        arreglo.add("Gael");

        System.out.println("arreglo = " + arreglo); //MUESTRA TODO EL ARREGLO
        System.out.println("arreglo = " + arreglo.get(1)); //MUESTRA EL ELEMENTO 1

        arreglo.remove(1);  //ELIMINA EL INDICE 1
        System.out.println("arreglo = " + arreglo);

        arreglo.set(0,"Capooo");    //REEMPLAZO ELEMENTO 1 Y MUESTRO CON FOR
        for (String cadena: arreglo)
        {
            System.out.println("cadena = " + cadena);
        }

        boolean esta = arreglo.contains("Juan");  //REALIZA UNA BUSQUEDA SI ESTA JUAN DEVUELVE V O F
        {
            System.out.println("esta = " + esta);
        }

        Collections.sort(arreglo);  //ORDENA EL ARREGLO
        System.out.println("Arreglo Ordenado: " + arreglo);

    }
}