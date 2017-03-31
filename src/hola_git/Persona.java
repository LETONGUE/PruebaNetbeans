/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola_git;

/**
 *
 * @author Luis Huayta
 */
public class Persona {
    
    
    private String nombre;
    private String apellido;
    
    private String nick;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    private String email;
    private String nivel;
    
    
    public Persona(String nombre,String apellido,String email,String nivel)
    {
        this.apellido=apellido;
        this.email=email;
        this.nombre=nombre;
        this.nivel = nivel;
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
