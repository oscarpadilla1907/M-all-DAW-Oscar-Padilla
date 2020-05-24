
package Metodos;

import Ventanas.Musica;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Datos {
    
    public ArrayList <Musica> recogerDatos(int recoger){
    ResultSet musica = ConexionBD.EjecutarSentencia("SELECT * FROM CANCIONES");
    ArrayList <Musica> musicas = new ArrayList<Musica>();
    
    try{
    while(musica.next()){
        Musica mostrarMusica = new Musica();
        String nombre = musica.getString("nombre");
        String autor = musica.getString("autor");
        String url = musica.getString("url");
        int fecha = musica.getInt("fecha");
        mostrarMusica = new Musica(nombre, autor, url, fecha);
        musicas.add(mostrarMusica);
        
        }
    }catch(SQLException e){
        e.printStackTrace();
    }
    return musicas;
    }
    
}
