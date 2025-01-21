package com.berna.foro.hub.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Representa un tópico en un curso con sus respuestas y estado.
 */
public class topico {

    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private statusTopico status = statusTopico.NO_RESPONDIDO;
    private usuario autor;
    private curso curso;
    private List<respuesta> respuestas = new ArrayList<>();

    /**
     * Constructor para crear un tópico.
     * @param titulo El título del tópico.
     * @param mensaje El mensaje del tópico.
     * @param curso El curso al que pertenece el tópico.
     */
    public topico(String titulo, String mensaje, curso curso) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.curso = curso;
    }

    // Métodos get y set
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public statusTopico getStatus() {
        return status;
    }

    public void setStatus(statusTopico status) {
        this.status = status;
    }

    public usuario getAutor() {
        return autor;
    }

    public void setAutor(usuario autor) {
        this.autor = autor;
    }

    public curso getcurso() {
        return curso;
    }

    public void setcurso(curso curso) {
        this.curso = curso;
    }

    public List<respuesta> getrespuestas() {
        return respuestas;
    }

    public void setrespuestas(List<respuesta> respuestas) {
        this.respuestas = respuestas;
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
        topico other = (topico) obj;
        return Objects.equals(id, other.id);
    }

    // Método toString (opcional, para mayor legibilidad)
    @Override
    public String toString() {
        return "Topico{id=" + id + ", titulo='" + titulo + "', mensaje='" + mensaje + "', fechaCreacion=" + fechaCreacion +
                ", status=" + status + ", autor=" + autor + ", curso=" + curso + ", respuestas=" + respuestas + "}";
    }
}
