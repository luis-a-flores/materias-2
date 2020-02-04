package uaslp.ingenieria.objetos.data;

public class Grupo {
    private final Materia materia;
    private final String clave;
    private final String horario;
    private Profesor profesor;

    public Grupo(Materia materia, String clave, String horario, Profesor profesor) {
        this.materia = materia;
        this.clave = clave;
        this.horario = horario;
        this.profesor = profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getNombreMateria() {
        return materia.getNombre();
    }

    public String getClave() {
        return materia.getClave() + clave;
    }

    public int getCreditos() {
        return materia.getCreditos();
    }

    public String getNombreProfesor() {
        return profesor.getNombre();
    }

    public String getHorario() {
        return horario;
    }
}
