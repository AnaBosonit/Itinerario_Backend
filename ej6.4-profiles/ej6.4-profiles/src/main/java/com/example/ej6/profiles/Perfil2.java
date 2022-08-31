package com.example.ej6.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles{


    String perfil = "perfil2";
    @Override
    public String miFuncion() {

    return "El " + perfil + " es el activo.";
    }


}
