
package modelo;
import Ventanas.*;
import Metodos.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Users {
    
    
    public boolean checkUserAndPass(String nick, String password) {
		System.out.print("aqui tamo en user"); ResultSet usuarioBD = ConexionBD.EjecutarSentencia("SELECT * FROM usuario WHERE nick = 'ola' and password = 'ola';");
		System.out.print("aqui tamo en user");
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
}
