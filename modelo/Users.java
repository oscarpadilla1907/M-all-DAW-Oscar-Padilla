
package modelo;
import Ventanas.*;
import Metodos.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Users {
    
    
    public boolean checkUserAndPass(String nick, String password) {
	 ResultSet usuarioBD = ConexionBD.EjecutarSentencia("SELECT * FROM usuario WHERE nick = '"+nick+"' and password = '"+password+"';");
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
}
