package net.youtics.interfaces;

public class Pagina extends Hoja {

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return contenido;
    }

}
