import net.youtics.interfaces.*;

import java.lang.reflect.GenericDeclaration;

public class Main {

    public static void main(String[] args){

        Curriculum cv = new Curriculum("Contenido CV", "Leo Messi", "Inter de Miami");
        cv.addExperiencia("Campeón Mundial");
        cv.addExperiencia("8 Balones de Oro");
        cv.addExperiencia("PSG");
        imprimirAbs(cv);
        System.out.println("==================================================");
        Informe inf = new Informe("Contenido del informe", "Dibu Martinez", "Rodrigo de Poul");
        imprimirAbs(inf);

        System.out.println("==================================================");
        Libro libro = new Libro("Jose", "JAVA 2024", Genero.CIENCIA_FICCIÓN);
        libro.addPagina(new Pagina("Pagina 1"));
        libro.addPagina(new Pagina("Pagina 2"));
        libro.addPagina(new Pagina("Pagina 3"));

        imprimirAbs(libro);

    }

    public static void imprimirAbs(Imprimible hoja)
    {
        System.out.println("hoja.imprimir() = " + hoja.imprimir());
    }
}