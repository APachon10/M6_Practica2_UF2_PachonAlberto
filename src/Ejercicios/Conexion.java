package Ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	public Connection conectar() {
		// MySQL
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_videoclub",
					"root",
					"");
			System.out.println("Acceso Ejecutado correctamente ");
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println("===================");
			e.printStackTrace();
		}
		return conexion;
	}
}
