package Ejercicios;

import Interfaces.ParametrosConexion;

public class Principal implements ParametrosConexion{
	public static void main(String[] args) {
		Conexion c = new Conexion();
		c.conectar(ParametrosConexion.url,ParametrosConexion.user,ParametrosConexion.password);
	}
}	
