package test;

import datos.Conexion;
import datos.UsuarioDao;
import datos.UsuarioDaoJDBC;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.List;

public class ManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            UsuarioDao usuarioDao = new UsuarioDaoJDBC(conexion);

            List<UsuarioDTO> usuarios = usuarioDao.select();

            for (UsuarioDTO usuario : usuarios) {
                System.out.println("UsuarioDTO: " + usuario);
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

/*Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            UsuarioDaoJDBC usuarioJdbc = new UsuarioDaoJDBC(conexion);

            UsuarioDTO cambioUsuario = new UsuarioDTO();
            cambioUsuario.setId_usuario(1);
            cambioUsuario.setUsername("juan.perez.1");
            cambioUsuario.setPassword("123");
            usuarioJdbc.update(cambioUsuario);

            UsuarioDTO nuevoUsuario = new UsuarioDTO();
            nuevoUsuario.setUsername("carlos.ramirez");
            nuevoUsuario.setPassword("12311111111111111111111111111111111111111111111111");
            //nuevoUsuario.setPassword("123");
            usuarioJdbc.insert(nuevoUsuario);

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
        }*/
