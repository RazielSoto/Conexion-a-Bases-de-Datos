package test;

import datos.Conexion;
import datos.PersonaDao;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.*;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDao personaDao = new PersonaDaoJDBC(conexion);
            List<PersonaDTO> personas = personaDao.select();

            for (PersonaDTO persona : personas) {
                System.out.println("Persona DTO:" + persona);
            }
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}


/*PersonaDaoJDBC personaDao = new PersonaDaoJDBC();
        List<PersonaDTO> personas = personaDAO.select();

        for (PersonaDTO persona : personas) {
            System.out.println("persona:" + persona);
        }
        PersonaDTO persona = new PersonaDTO();
        persona.setId_Persona(3);*/ //PersonaDAO.delete(persona);
//INSERTANDO UN NUEVO OBJETO DE TIPO PERSONA
//Persona personaNueva = new PersonaDTO("Carlos", "Esparza", "cesparza@gmail.com", "5591853622");
//personaDao.insert(personaNueva);
//MODIFICAR UN OBJETO DE PERSONA EXISTENTE
//        PersonaDTO personaModificar = new PersonaDTO(5,"Juan", "Esparza", "juanparza@gmail.com", "5591853622");
//        personaDao.actualizar(personaModificar);
//ELIMINAR UN REGISTRO
//        PersonaDTO personaEliminar = new PersonaDTO(3);
//        personaDao.eliminar(personaEliminar);
//        //LISTADO DE PERSONAS
//        List<Persona> personas = personaDao.select();
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });

