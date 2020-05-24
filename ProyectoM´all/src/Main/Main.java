
import java.sql.ResultSet;
import java.sql.SQLException;

import Metodos.ConexionBD;
import Ventanas.InicioSesion;
import Ventanas.Menu;
import java.awt.EventQueue;

public class Main {

    public static void main(String[] args) throws SQLException{
        
        ConexionBD.Conectar();

   
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu frame = new Menu();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setTitle("M´All");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

    


