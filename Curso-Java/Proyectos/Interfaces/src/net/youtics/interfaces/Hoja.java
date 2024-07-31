package net.youtics.interfaces;

import javax.xml.transform.sax.SAXResult;

public abstract class Hoja {

    protected String contenido;

    public Hoja(String contenido){

        this.contenido = contenido;

    }

    public String soyhoja()
    {
        return "Soy Abstract";
    }

    abstract public String imprimir();

    @Override
    public String toString() {
        return "Hoja{" +
                "contenido='" + contenido + '\'' +
                '}';
    }
}
