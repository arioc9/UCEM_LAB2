package com.arioc.jsf.Modelo;

import lombok.Data;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "Personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @Column(name = "pnombre")
    public String pnombre;
    @Column(name = "snombre")
    public String snombre;
    @Column(name = "papellido")
    public String papellido;
    @Column(name = "sapellido")
    public String sapellido;

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
