package com.arioc.jsf.Crud;
import com.arioc.jsf.Modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCrud extends CrudRepository<Persona,Integer> {
}
