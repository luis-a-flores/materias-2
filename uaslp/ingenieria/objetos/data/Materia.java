package uaslp.ingenieria.objetos.data;

public class Materia {
    private final String nombre;
    private final String clave;
    private final int creditos;

    public Materia(String nombre, String clave, int creditos) {
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getCreditos() {
        return creditos;
    }
}
