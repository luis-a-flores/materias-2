package uaslp.ingenieria.objetos.data;

public class Profesor {
    private final String firstName;
    private final String lastName;

    public Profesor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNombre() {
        return firstName + " " + lastName;
    }
}
