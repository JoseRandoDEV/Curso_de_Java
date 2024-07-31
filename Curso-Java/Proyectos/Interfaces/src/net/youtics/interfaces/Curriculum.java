package net.youtics.interfaces;

import java.util.ArrayList;

public class Curriculum extends Hoja implements Imprimible
{
    private String persona;
    private String carrera;
    private ArrayList<String> experiencia;

    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public void addExperiencia(String exp)
    {
        this.experiencia.add(exp);
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<String> getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(ArrayList<String> experiencia) {
        this.experiencia = experiencia;
    }


    @Override
    public String imprimir() {
        return "Curriculum{" +
                "persona='" + persona + '\'' +
                ", carrera='" + carrera + '\'' +
                ", experiencia=" + experiencia +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
