package com.example.EjercicioCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController

public class AlterController {
    @Autowired
    PersonaService personaService;


    /*
    @Autowired
    List<Persona> personaList;

     */

    @PutMapping("persona/{id}")
    public List<Persona> alterPersona(@PathVariable String id, @RequestBody Persona persona) {
        int idPersona = persona.getId();
        String nombrePersona = persona.getNombre();
        String poblacionPersona = persona.getPoblacion();
        int edadPersona = persona.getEdad();
        Persona personAltered = new Persona();
        System.out.println("ID:" + id);
        for (Persona p : personaService.getPersonasList()) {

            if (p.getId() == Integer.parseInt(id)) {

                if (nombrePersona != null) {
                    p.setNombre(nombrePersona);

                }
                if (poblacionPersona != null) {
                    p.setPoblacion(poblacionPersona);

                }
                if (edadPersona > 0) {
                    p.setEdad(edadPersona);

                }

            }
        }
        return personaService.getPersonasList();
    }
}
