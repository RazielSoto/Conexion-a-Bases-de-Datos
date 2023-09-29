package test;

import datos.Conexion;
import datos.PlantaJDBC;
import domain.Planta;
import domain.Planta;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

public class ManejoPlantas {

    public static void main(String[] args) {
        //Conexion de Transacciones 
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PlantaJDBC plantaJdbc = new PlantaJDBC(conexion);
//            List<Planta> plantas = plantaJdbc.select();

//            for (Planta planta : plantas) {
//                System.out.println("Plantas: " + planta);
//            }

//            Planta planta = new Planta();

            Planta cambioPlanta = new Planta();
            cambioPlanta.setId_planta(11);
            cambioPlanta.setNombre_científico("Begonia");
            cambioPlanta.setNombre_común("Flor de azúcar");
            cambioPlanta.setRegión("America, Africa y Asia ");
            cambioPlanta.setPrecio(350);
            cambioPlanta.setTamaño(60);
            plantaJdbc.insert(cambioPlanta);
//            plantas.forEach(personas -> {
//                System.out.println("Plantas: " + planta);
//            });
            conexion.commit();

            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al rollback");
                //if (conexion != null) {
                    conexion.rollback();
                //}
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException ex) {
                    ex.printStackTrace(System.out);
                }
            }
        }
    }
}
