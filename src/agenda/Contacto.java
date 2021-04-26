/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Objects;

/**
 *
 * @author sonix
 */
public class Contacto {
    private String email;
    private String telefono;
    private String nombre;
    private int n;

    public Contacto() {
    }

    public Contacto(String email, String telefono, String nombre) {
        this.email = email;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Contacto{" + "email=" + email + ", telefono=" + telefono + ", nombre=" + nombre + ", n=" + n + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.telefono);
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + this.n;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        if (this.n != other.n) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
   /*
    public void contactoCheck(){
    
        if (contacto == null || contacto.getEmail() == null || contacto.getEmail().isEmpty()
                || nombre()== null || contacto.getNombre().isEmpty() 
                || contacto.getTelefono()== null || contacto.getTelefono().isEmpty()) {
            
        }
    }
    */
}
