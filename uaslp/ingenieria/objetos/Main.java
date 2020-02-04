package uaslp.ingenieria.objetos;

import uaslp.ingenieria.objetos.data.Grupo;
import uaslp.ingenieria.objetos.data.Materia;
import uaslp.ingenieria.objetos.data.Profesor;

public class Main {

    public static void main(String[] args) {

        Profesor eloy = new Profesor("Eloy", "Hernández Castro");
        Profesor ivan = new Profesor("Ivan Israel", "Uresti Adame");
        Profesor paco = new Profesor("Francisco Javier", "Torres Reyes");
        Profesor alberto = new Profesor("Alberto Salvador", "Nuñez Varela");
        Profesor miguelAngel = new Profesor("Miguel Angel", "De la Cruz");
        Profesor botello = new Profesor("Miguel Angel", "Botello Aragón");

        Materia objetos = new Materia("TECNOLOGIA ORIENTADA A OBJETOS", "2234", 8);
        Materia algoritmos = new Materia("ALGORITMOS Y COMPLEJIDAD", "2235", 8);
        Materia grafos = new Materia("Grafos", "2133", 10);

        Grupo objetos01 = new Grupo(objetos, "01", "08-09", eloy);
        Grupo objetos02 = new Grupo(objetos, "02", "09-10", paco);
        Grupo objetos03 = new Grupo(objetos, "03", "14-15", alberto);
        Grupo algoritmos01 = new Grupo(algoritmos, "01", "10-11", miguelAngel);
        Grupo grafos01 = new Grupo(grafos, "01", "11-12", botello);

        objetos01.setProfesor(ivan);

        Grupo []grupos = new Grupo[]{objetos01, objetos02, objetos03, algoritmos01, grafos01};

        for(Grupo grupo: grupos){
            System.out.println("materia: "+ grupo.getNombreMateria());
            System.out.println("clave: "+grupo.getClave());
            System.out.println("creditos"+grupo.getCreditos());
            System.out.println("profesor"+grupo.getNombreProfesor());
            System.out.println("horario"+grupo.getHorario());
            System.out.println("--------------------------------");
        }


    }
}
