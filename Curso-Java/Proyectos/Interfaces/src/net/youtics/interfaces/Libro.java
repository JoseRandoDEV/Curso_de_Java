package net.youtics.interfaces;

import java.util.ArrayList;

public class Libro implements Imprimible {

    private ArrayList<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina (Hoja Pagina)
    {
        this.paginas.add(Pagina);
        return this;
    }

    public String imprimir() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Autor: ").append(this.autor)
                .append("\n")
                .append("Titulo: ").append(this.titulo)
                .append("\n")
                .append("Genero: ").append(this.genero)
                .append("\n")
                .append("Paginas: ");

        for (Hoja h: this.paginas){
            stringBuilder.append("\n")
                    .append(h.imprimir())
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}
