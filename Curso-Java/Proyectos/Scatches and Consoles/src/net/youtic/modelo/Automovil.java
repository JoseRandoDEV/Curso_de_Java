package net.youtic.modelo;

public class Automovil {

    private String color;
    private Integer tanque;
    private String persona;
    private double cilindrada;

    public Automovil()    //METODO CONSTRUCTOR VACIO
    {
    }

    public Automovil(String color, Integer tanque, String persona, double cilindrada) {
        this.color = color;
        this.tanque = tanque;
        this.persona = persona;
        this.cilindrada = cilindrada;
    }
    public Automovil(String persona) {
        this.persona = persona;

    }

    public String getColor() {
        return color;
    }

    public Integer getTanque() {
        return tanque;
    }

    public String getPersona() {
        return persona;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTanque(Integer tanque) {
        this.tanque = tanque;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "color='" + color + '\'' +
                ", tanque=" + tanque +
                ", persona='" + persona + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }
}

