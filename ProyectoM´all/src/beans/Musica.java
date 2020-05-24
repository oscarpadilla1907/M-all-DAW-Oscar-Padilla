
package beans;

public class Musica {
    public String nombre;
    public String autor;
    public String url;
    public int fecha;
    
    public Musica(){
        
    }

    public Musica(String nombre, String autor, String url, int fecha){
        
        this.nombre=nombre;
        this.autor=autor;
        this.url=url;
        this.fecha=fecha;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
}
