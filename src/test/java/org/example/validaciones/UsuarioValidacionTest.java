package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    UsuarioValidacion  usuarioValidacion;

    @BeforeEach
    public void  configurarPruebasIniciales(){
        System.out.println("estoy ejecutando la prueba");
        this.usuarioValidacion =new UsuarioValidacion();
    }

    @Test
    public void validarNombreFallaPorNombreCorto(){
        String  pruebanombre= "juan";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarNombre(pruebanombre));
        Assertions.assertEquals(Mensaje.LONGITUD_NOMBRE.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarfallanombrecaracteres(){
    String pruebanombre= "juiscorr%derfg.,.,erg";
    Exception respuesta= Assertions.assertThrows(Exception.class,()-> this.usuarioValidacion.validarNombre(pruebanombre));
    Assertions.assertEquals(Mensaje.FORMATO_NOMBRE.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarnombreCorrecto(){
    String pruebaNombre= "dfglfdhdflgdsgjdfhgfdj";
    Boolean respuesta=Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarNombre(pruebaNombre));
    Assertions.assertTrue(respuesta);
    }

@Test
    public void ValidarCorreoCorrecto(){
    String CorreoPueba= "luistorres@gmail.com";
    Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.usuarioValidacion.validarCorreo(CorreoPueba));
    Assertions.assertTrue(respuesta);

}

@Test
    public void validarCorreoIncorrecto(){
    String correoPrueb= "dfdgff";
    Exception respuesta= Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarCorreo(correoPrueb));
    Assertions.assertEquals(Mensaje.VALIDACION_CORREO.getMensaje(),respuesta.getMessage());
}

@Test
    public void validarUbicacionMala(){
    int ubicacionPrueba= 122;
    Exception respuesta= Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarUbicacion(ubicacionPrueba));
    Assertions.assertEquals(Mensaje.VALIDAR_UBICACION.getMensaje(),respuesta.getMessage());

}

@Test
    public void validarUbicacionBuena(){
    int ubicacionPrueba= 2;
boolean respuesta=Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarUbicacion(ubicacionPrueba));
Assertions.assertTrue(respuesta);
}







}