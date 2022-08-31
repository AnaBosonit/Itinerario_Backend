package com.example.EjercicioCRUD;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    Persona persona = new Persona();

    List<Persona> personaList = new ArrayList<>();


    @Override
    public String getNombre() {
        return persona.getNombre();
    }

    @Override
    public String getPoblacion() {
        return persona.getPoblacion();
    }

    @Override
    public int getEdad() {
        return persona.getEdad();
    }

    @Override
    public int getId(){
        return persona.getId();
    }


    @Override
    public List<Persona> getPersonasList() {
        return personaList;
    }

    @Override
    public Persona addPersona(Persona persona) {
        personaList.add(persona);
        return persona;
    }

    @Override
    public void setNombre(String nombre) {
        persona.setNombre(nombre);
    }

    @Override
    public void setPoblacion(String poblacion) {
        persona.setPoblacion(poblacion);
    }

    @Override
    public void setEdad(int edad) {
        persona.setEdad(edad);
    }


}
