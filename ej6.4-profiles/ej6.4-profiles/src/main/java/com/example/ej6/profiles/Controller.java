package com.example.ej6.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Perfiles perfiles;

    @Autowired
    MiConfiguracion miConfiguracion;

    @Value("${url}")
    String url;

    @Value("${password}")
    String password;


    @GetMapping("parametros")
    public String getUrlAndPassword(){
        return "Url: " + url + " - Password: " + password;
    }

    @GetMapping("perfil")
    public String getPerfil(){
        return perfiles.miFuncion();
    }

    @GetMapping("miconfiguracion")
    public String getMiConfiguracion(){
        return miConfiguracion.toString();
    }
}
