package com.example.ej6.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles {

    String perfil = "perfil1";
    @Override
    public String miFuncion() {
        return "El " + perfil + " es el activo.";

    }


}
