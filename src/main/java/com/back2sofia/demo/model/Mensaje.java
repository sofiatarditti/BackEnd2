
package com.back2sofia.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mensaje {
    
    private String mensaje;

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
