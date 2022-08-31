package com.example.EjercicioCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class DeleteController {
    @Autowired
    PersonaService personaService;


    /*
    @Autowired
    List<Persona> personaList;

     */

    @DeleteMapping("persona/{id}")
    public List<Persona> deletePersona(@PathVariable long id){

       personaService.getPersonasList().removeIf(p -> p.getId() == id);

        return personaService.getPersonasList();
    }
}
