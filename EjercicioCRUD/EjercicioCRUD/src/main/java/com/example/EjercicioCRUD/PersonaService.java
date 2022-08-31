package com.example.EjercicioCRUD;

import java.util.List;

public interface PersonaService {
    String getNombre();
    String getPoblacion();
    int getEdad();

    void setNombre(String nombre);
    void setPoblacion(String poblacion);
    void setEdad(int edad);

    int getId();


    public Persona addPersona(Persona persona);

    List<Persona> getPersonasList();


    String toString();



}
