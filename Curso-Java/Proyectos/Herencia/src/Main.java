import Net.Youstic.Herencias.Docente;
import Net.Youstic.Herencias.Estudiante;

public class Main {

    public static void main(String[] args)
    {
        Estudiante estudiante = new Estudiante("Jose","Rando",7d);
        Estudiante estudiante2 = new Estudiante("Milo","Rando",9d);
        Estudiante estudiante3 = new Estudiante("Laura","Jauregui",8d);

        Docente docente = new Docente("Gonzalo","Beno",30);
        Docente docente2 = new Docente("Gustavo","Sonvi",30);

        System.out.println(docente2.toString());
    }
}