package com.berna.foro.hub.modelo;

import java.time.LocalDateTime;
import java.util.Objects;

public class respuesta {

    private Long id;
    private String mensaje;
    private topico topico;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private usuario autor;
    private Boolean solucion = false;

    // Métodos get y set
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public topico getTopico() {
        return topico;
    }

    public void setTopico(topico topico) {
        this.topico = topico;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public usuario getAutor() {
        return autor;
    }

    public void setAutor(usuario autor) {
        this.autor = autor;
    }

    public Boolean getSolucion() {
        return solucion;
    }

    public void setSolucion(Boolean solucion) {
        this.solucion = solucion;
    }

    // Sobrescritura de hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Sobrescritura de equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        respuesta other = (respuesta) obj;
        return Objects.equals(id, other.id);
    }

    // Método toString (opcional)
    @Override
    public String toString() {
        return "respuesta{id=" + id + ", mensaje='" + mensaje + "', topico=" + topico + ", fechaCreacion=" + fechaCreacion +
                ", autor=" + autor + ", solucion=" + solucion + "}";
    }
}
