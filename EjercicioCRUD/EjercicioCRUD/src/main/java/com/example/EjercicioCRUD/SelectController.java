package com.example.EjercicioCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class SelectController {
    @Autowired
    PersonaService personaService;


    /*
    @Autowired
    List<Persona> personaList;

     */

    @GetMapping("persona/{id}")
    public Persona getPersonaPorId(@PathVariable String id){
        Persona person = new Persona();
        for(Persona p:personaService.getPersonasList()){
            if(p.getId() == Integer.parseInt(id)){
                person = p;

            }
        }

        return person;
    }

    @GetMapping("persona/nombre/{nombre}")
    public List<Persona> getPersonaPorNombre(@PathVariable String nombre){
        List<Persona> lista = new ArrayList<>();
        lista.clear();

        for(Persona p:personaService.getPersonasList()){

            if(p.getNombre() != nombre){
                lista.add(p);
            }
        }

        for(Persona x:lista){
            System.out.println(x.getNombre());

        }
        return lista;

    }
}
