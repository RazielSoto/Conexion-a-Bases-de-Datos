package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        List<Persona> personas = personaDAO.select();

        for (Persona persona : personas) {
            System.out.println("persona:" + persona);
        }
        Persona persona = new Persona();
        persona.setId_Persona(3);

        //PersonaDAO.delete(persona);

        //INSERTANDO UN NUEVO OBJETO DE TIPO PERSONA
        //Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@gmail.com", "5591853622");
        //personaDao.insert(personaNueva);
        //MODIFICAR UN OBJETO DE PERSONA EXISTENTE
//        Persona personaModificar = new Persona(5,"Juan", "Esparza", "juanparza@gmail.com", "5591853622");
//        personaDao.actualizar(personaModificar);
        //ELIMINAR UN REGISTRO
//        Persona personaEliminar = new Persona(3);
//        personaDao.eliminar(personaEliminar);
//        //LISTADO DE PERSONAS
//        List<Persona> personas = personaDao.select();
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });
    }
}
