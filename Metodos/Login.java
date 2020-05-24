package Metodos;

import Ventanas.App;
import Ventanas.InicioSesion;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Login {

    // Esto es el login que nos facilitaste

    public void checkUser(String nick, String Password) {
        
        boolean userCheck = new modelo.Users().checkUserAndPass(nick, Password);
        
        if(userCheck) { 
                    
            JOptionPane.showMessageDialog(null, "Welcome to M´All");
            App abrir = new App();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            abrir.setTitle("M´All");
            
            
            //this.dispose();
        }else { // Sino error
            JOptionPane.showMessageDialog(null, "Datos no validos");
        }
    }
}
