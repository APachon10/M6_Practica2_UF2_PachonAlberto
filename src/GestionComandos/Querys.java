package GestionComandos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Ejercicios.Conexion;
import Interfaces.ParametrosConexion;

public class Querys implements ParametrosConexion{
	public void insertar() {
		Conexion c  = new Conexion();
		c.conectar(ParametrosConexion.url, ParametrosConexion.user, ParametrosConexion.password);
		try {
			String query_insert = "insert into socio values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = ((Connection) c).prepareStatement(query_insert);
			
			//Ponemos los Parametros
			/*pst
			pst
			pst
			pst
			pst
			pst
			pst
			pst
			pst
			pst
			pst
			pst*/
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println("===================");
			e.printStackTrace();
		}
	}
	public void update() {
		Conexion c  = new Conexion();
		c.conectar(ParametrosConexion.url, ParametrosConexion.user, ParametrosConexion.password);
		try {
			String query_update = "";
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println("===================");
			e.printStackTrace();
		}
	}
	public void delete() {
		Conexion c  = new Conexion();
		c.conectar(ParametrosConexion.url, ParametrosConexion.user, ParametrosConexion.password);
		try {
			String query_delete = "";
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println("===================");
			e.printStackTrace();
		}
	}
}
