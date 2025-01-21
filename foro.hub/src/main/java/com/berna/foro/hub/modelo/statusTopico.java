package com.berna.foro.hub.modelo;

/**
 * Enum que representa el estado de un tópico.
 */
public enum statusTopico {

    /**
     * Estado cuando el tópico no ha recibido respuesta.
     */
    NO_RESPONDIDO,

    /**
     * Estado cuando el tópico ha sido respondido pero no se ha solucionado el problema.
     */
    NO_SOLUCIONADO,

    /**
     * Estado cuando el tópico ha sido respondido y el problema ha sido solucionado.
     */
    SOLUCIONADO,

    /**
     * Estado cuando el tópico ha sido cerrado, ya no está activo.
     */
    CERRADO;
}
