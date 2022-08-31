package com.example.EjercicioCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class AddController {
    @Autowired
    PersonaService personaService;

    /*
    @Autowired
    List<Persona> personaList;

     */

    @PostMapping("persona")
    public void addPersona(@RequestBody Persona persona){
        personaService.addPersona(persona);
    }
}
