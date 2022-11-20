package com.arioc.jsf.Modelo.Mapper;
import com.arioc.jsf.Modelo.Persona;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaMapper implements RowMapper<Persona> {

    public Persona mapRow(ResultSet rs,int rowNum) throws SQLException {
        Persona persona = new Persona();
        persona.setId(rs.getInt("id"));
        persona.setPnombre(rs.getString("pnombre"));
        persona.setSnombre(rs.getString("snombre"));
        persona.setPapellido(rs.getString("papellido"));
        persona.setSapellido(rs.getString("sapellido"));
        return persona;
    }

}
