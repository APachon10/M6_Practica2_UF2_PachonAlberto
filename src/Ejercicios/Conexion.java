package Ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;

import Interfaces.ParametrosConexion;

public class Conexion implements ParametrosConexion{
	public Connection conectar(String url,String user,String password) {
		// MySQL
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_videoclub",
					"root",
					"");
			System.out.println("Acceso a la base de Datos " + ParametrosConexion.database_name + " Ejecutado con exito ");
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println("===================");
			e.printStackTrace();
		}
		return conexion;
	}
}
