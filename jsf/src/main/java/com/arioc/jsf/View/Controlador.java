package com.arioc.jsf.View;

import com.arioc.jsf.Modelo.Persona;
import com.arioc.jsf.Servicio.PersonaServicio;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@RequestScope
@Data
public class Controlador implements Serializable {

    private PersonaServicio personaServicio;

    @Autowired
    public Controlador(PersonaServicio personaServicio) {
        this.personaServicio = personaServicio;
    }
   
    private Persona guardarpersona = new Persona();
    private Persona buscarpersona = new Persona();
    private List<Persona> listapersonas;
    private Integer buscarId;
    private Integer eliminarId;

    @PostConstruct
    public void init() {
        listapersonas = personaServicio.obtenertodo();
    }

    public void guardar(){
        personaServicio.guardar(guardarpersona);
        listapersonas = personaServicio.obtenertodo();
        guardarpersona = new Persona();
    }

    public void buscar(){
        if(buscarId != null){
            buscarpersona = personaServicio.buscarporid(buscarId);
        }
    }

    public void eliminar(){
        if(eliminarId != null){
            personaServicio.eliminarporid(eliminarId);
            listapersonas = personaServicio.obtenertodo();
            eliminarId = null;
        }
    }

}
