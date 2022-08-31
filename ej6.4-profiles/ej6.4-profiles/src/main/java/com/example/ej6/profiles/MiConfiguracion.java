package com.example.ej6.profiles;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("miconfiguracion.properties")
@ToString
public class MiConfiguracion {
    @Value("${valor1}")
    String valor1;
    @Value("${valor2}")
    String valor2;

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getValor1() {
        return valor1;
    }

    public String getValor2() {
        return valor2;
    }

    /*
    @Override
    public String toString() {
        return String.format("%s[valor1=%s, valor2=%s]", getClass().getSimpleName(), valor1, valor2);
    }
     */
}
