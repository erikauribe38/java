package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {

    OfertaValidacion ofertaValidacion = new OfertaValidacion();

    @Test
    public void comprobarLongitudTituloErroneo() {
        String titulo = "trgnbcxgfjnfghfghgfrhgfhghfgdfghhvdsghgrfn29857";
        Exception valor = Assertions.assertThrows(Exception.class, () -> this.ofertaValidacion.validarTitulo(titulo));
        Assertions.assertEquals(Mensaje.LONGITUD_OFERTA.getMensaje(), valor.getMessage());
    }

    @Test
    public void comprobarLongitudTituloCorrecto() {
        String titulo = "12689zy";
        Boolean valor = Assertions.assertDoesNotThrow(() -> this.ofertaValidacion.validarTitulo(titulo));
        Assertions.assertTrue(valor);
    }

    @Test
    public void comprobarFechasErroneas() {
        LocalDate fechaInicio = LocalDate.of(2023, 7, 2);
        LocalDate fechaFin = LocalDate.of(2023, 6, 1);
        Exception valor = assertThrows(Exception.class, () ->this.ofertaValidacion.validarTodasFechas(fechaInicio, fechaFin));
        Assertions.assertEquals(Mensaje.DIFERENCIA_FECHAS.getMensaje(),valor.getMessage());
    }

    @Test
    public void validarFechasErroneas(){
        LocalDate fechaInicio = LocalDate.of(2023,2,1);
        LocalDate fechaFin = LocalDate.of(2023,8,1);
        Boolean valor= Assertions.assertDoesNotThrow(()->this.ofertaValidacion.validarTodasFechas(fechaInicio,fechaFin));
        Assertions.assertTrue(valor);
    }

    @Test
    public void comprobarFormatoFechaErronea(){
        String fecha = "lorem";
        Exception valor=Assertions.assertThrows(Exception.class,()->this.ofertaValidacion.validarFormatoFechas(fecha));
        Assertions.assertEquals(Mensaje.FORMATO_FECHAS.getMensaje(),valor.getMessage());
    }


    @Test
    public void comprobarFormatoFechaCorrecta(){
        String fecha = "03/06/2021";
        Boolean valor = Assertions.assertDoesNotThrow(()-> this.ofertaValidacion.validarFormatoFechas(fecha));
        Assertions.assertTrue(valor);
    }

    @Test
    public void comprobarPrecioPersonaErronea(){
        Double precio = -2934872.345;
        Exception valor= Assertions.assertThrows(Exception.class,()->this.ofertaValidacion.validarCostoPersona(precio));
        Assertions.assertEquals(Mensaje.COSTO_PERSONA.getMensaje(),valor.getMessage());
    }

    @Test
    public void comprobarPrecioPersonaCorrecto() {
        Double precio = 34235435643.45546547;
        boolean valor = Assertions.assertDoesNotThrow(() -> this.ofertaValidacion.validarCostoPersona(precio));
        Assertions.assertTrue(valor);
    }
}







