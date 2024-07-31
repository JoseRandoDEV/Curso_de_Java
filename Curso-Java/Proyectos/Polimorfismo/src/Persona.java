public class Persona {

    private String nomYape;
    private Integer dni;

    public Persona(String nomYape, Integer dni) {
        this.nomYape = nomYape;
        this.dni = dni;
    }

    public String getNomYape() {
        return nomYape;
    }

    public void setNomYape(String nomYape) {
        this.nomYape = nomYape;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;

    }

    @Override
    public String toString() {
        return "Persona: " +
                "Nombre y Apellido: " + nomYape +
                ", Dni: " + dni;
    }
}
