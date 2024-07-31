package CollerctionSet;

import java.util.*;

public class MainSet {

    public static void main(String[] args) {

                Set<String>cadenas = new TreeSet<>();  // HashSte por TreeSet(ordenados)
                cadenas.add("Pepe");
                cadenas.add("Maria");
                cadenas.add("Fer");
                cadenas.add("Carla");
                cadenas.add("Carla");
                System.out.println("Cadenas.toString() = " + cadenas.toString());

                List<String> lista = new ArrayList<>(cadenas);
                Collections.sort(lista);
                System.out.println("lista.toString = " + lista.toString()); //ORDENA LA LISTA NO ACEPTA EL REPETIDO

                boolean esta = cadenas.contains("Pepe");  //BUSCAMOS A PEPE
                System.out.println("esta = " + esta);
                
                cadenas.remove("Fer");  //BUSCA A FER Y LO CAMBIA POR GAELITO
                cadenas.add("Gaelito");
        System.out.println("Nombres Modificado = " + cadenas);
    }
}

