package Map;

import CollerctionSet.Persona;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<Integer, Persona> mapa = new HashMap<>(); // TreeMap<> es igual en codigos
        Persona p = new Persona("Jose", 25957620);
        Persona p1 = new Persona("Laura", 28935570);
        Persona p2 = new Persona("Milo", 52723751);
        mapa.put(10,p);  //NO PERMITE QIE EL K SEA IGUAL, MUESTRA SOLO UN PEPITO
        mapa.put(2,p1);
        mapa.put(3,p2);  //SI CAMBIO EL K (1,2,3) LOS REPITE SIN PROBLEMA

        System.out.println("mapa.toString() = " + mapa.toString());

        Persona encontrada = mapa.get(2);
        System.out.println("encontrada = " + encontrada);
        Persona p3 = new Persona("Gaelito", 55023040);
        mapa.put(2, p3);
        System.out.println("mapa = " + mapa);

        boolean e = mapa.containsKey(20);
        System.out.println("e = " + e);

        boolean w = mapa.containsValue(p3);
        System.out.println("w = " + w);

        Collection<Persona> personas = mapa.values();
        for (Persona gente : personas ){
            System.out.println("V de las Personas = " + gente.getNombre());
        }

        Collection<Integer> KeysPersonas = mapa.keySet();
        for (Integer Keys : KeysPersonas ){
            System.out.println("K de las Personas = " + Keys);
        }

        //mapa.remove(3);  //BORRA UN ELEMNTO
        //System.out.println("mapa = " + mapa);
    }
}
