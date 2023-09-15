package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.Date;

public class OfertaValidacion {

    private Util util=new Util();

    public boolean validarTitulo(String titulo)throws Exception {
        if (titulo.length()> 20){
            throw new Exception(Mensaje.LONGITUD_OFERTA.getMensaje());
        }
        return true;
    }
    public Boolean validarTodasFechas (LocalDate fechainicio, LocalDate fechaFin)throws Exception {
        if (fechaFin.isBefore(fechainicio)){
            throw new Exception(Mensaje.DIFERENCIA_FECHAS.getMensaje());
        }
        return true;
    }
    public boolean validarFormatoFechas (String fecha)throws Exception{
        if (!util.buscarFormato(fecha, "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")){
            throw new Exception(Mensaje.FORMATO_FECHAS.getMensaje());
        }
        return true;
    }
    public boolean validarCostoPersona (Double costopersona) throws Exception{
        if (costopersona < 0){
            throw new Exception(Mensaje.COSTO_PERSONA.getMensaje());
        }
        return true;
    }
}
