package org.example.validaciones;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //preparo la prueba
    UsuarioValidacion usuarioValidacion;


    public void ConfigurarPruebasIniciales(){
        System.out.println("estoy ejecutando la prueba");

        this.usuarioValidacion=new UsuarioValidacion();

    }
    @Test
    public void ValidarnombreFallaporNombrecorto(){}
    @Test
    public void  ValidarnombreFallaporCaracteres(){}
    @Test
    public void ValidarNombreCorrecto(){}
}