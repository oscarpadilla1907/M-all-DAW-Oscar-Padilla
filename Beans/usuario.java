package beans;


public class usuario {
    
    public String nick;
    public String nombre;
    public String correo;
    public String password;
    
    
    public usuario(){
        
    }

    public usuario(String nombre, String nick, String password, String correo){
        
        this.nombre=nombre;
        this.nick=nick;
        this.password=password;
        this.correo=correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    


    
}

