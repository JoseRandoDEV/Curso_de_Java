import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Persona estudiante = new Estudiante("Gael Rando", 55023040, 1);
        Persona estudiante2 = new Estudiante("Milo Rando", 52723751, 4);
        Persona estudiante3 = new Estudiante("Joaquin Masarino", 55951258, 6);

        Persona docente = new Docente("Mauro Mouris", 16520417, 30);
        Persona docente2 = new Docente("Angel Dev", 15698752, 40);
        Persona docente3 = new Docente("Gabriel Chadul", 19520174, 50);

        List<Persona> list = new ArrayList<>();
        list.add(estudiante);
        list.add(estudiante2);
        list.add(estudiante3);
        list.add(docente);
        list.add(docente2);
        list.add(docente3);

        ((Docente) docente).setCanHorasClase(100); //CASTEO LA CANTIDAD DE HORAS DE MOURIS
        for (Persona p : list) {
            //System.out.println("Persona: " + p.toString()); //MUESTRA A TODOS

            if (p instanceof Docente) {
                System.out.println("Persona: " + p.toString()); //MUESTRA SOLO DOCENTES

            }
        }
    }
}