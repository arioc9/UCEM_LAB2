package com.arioc.jsf.Servicio;
import com.arioc.jsf.Crud.PersonaCrud;
import com.arioc.jsf.Modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicio {
    private final PersonaCrud personaCrud;

    @Autowired
    public PersonaServicio(PersonaCrud personaCrud) {
        this.personaCrud = personaCrud;
    }


    public List<Persona> obtenertodo(){
        return (List<Persona>) personaCrud.findAll();
    }

    public void guardar(Persona persona){
        personaCrud.save(persona);
    }

    public Persona buscarporid(Integer id){
        return personaCrud.findById(id).orElse(null);
    }

    public void eliminarporid(Integer id){
         personaCrud.deleteById(id);
    }


}
