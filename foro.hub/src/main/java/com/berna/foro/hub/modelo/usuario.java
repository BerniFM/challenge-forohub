package com.berna.foro.hub.modelo;

import java.util.Objects;

/**
 * Representa un usuario con su ID, nombre, email y contraseña.
 */
public class usuario {

    private Long id;
    private String nombre;
    private String email;
    private String contrasena;

    /**
     * Sobrescritura del método hashCode para garantizar la coherencia con equals.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Sobrescritura del método equals para comparar usuarios por ID.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        usuario other = (usuario) obj;
        return Objects.equals(id, other.id);
    }

    // Métodos getter y setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Sobrescritura de toString (opcional) para representación legible.
     */
    @Override
    public String toString() {
        return "Usuario{id=" + id + ", nombre='" + nombre + "', email='" + email + "'}";
    }
}
