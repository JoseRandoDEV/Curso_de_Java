package net.youtics.interfaces;

public class Informe extends Hoja implements Imprimible
{
    private String autor;
    private String revisor;

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Autor: " + this.autor + "\n" +
                "Revisor: " + this.revisor + "\n" +
                "Contenido: " + super.toString();
    }
}
