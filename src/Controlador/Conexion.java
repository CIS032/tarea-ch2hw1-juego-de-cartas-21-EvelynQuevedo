/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Toshiba
 */
public class Conexion {
       public Connection ControladorBadedeDatos() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("Driver javaDB cargado");
        } catch (ClassNotFoundException es) {
            System.out.println("Error no encuentra la clase");
        }
        Connection conexion = null;
        try {
            String url = "jdbc:derby://localhost:1527/Banco";
            conexion = DriverManager.getConnection(url, "Administrador", "admin");
            System.out.println("Conexion establecida a la Base de Datos");
        } catch (SQLException ex) {
            System.out.println("No se pudo establecer conexion a la ase de datos");
        }
        return conexion;
    }

}


