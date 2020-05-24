package Metodos;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Login {

    // Chequeo del Login

    public void checkUser(String nick, String Password) {
        System.out.print("aqui tamo");
        boolean userCheck = new modelo.Users().checkUserAndPass(nick, Password);
        System.out.print("aqui tamo");
        if(userCheck) { 
                    
            JOptionPane.showMessageDialog(null, "Bienvenido");
            
            //this.dispose();
        }else { // Sino error
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    }
}
