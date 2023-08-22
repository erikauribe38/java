package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.Date;

public class OfertaValidacion {

    private Util util=new Util();
    public boolean validarTitulo(String titulo) throws Exception{
        if (titulo.length() > 30){
            throw new Exception(Mensaje.NOMBRE_EMPRESA.name());
        }
        return true;
    }

    public Boolean validarTodasFechas (LocalDate fechainicio, LocalDate fechaFin) throws  Exception{
        if (fechaFin.isBefore(fechainicio)){
            throw new Exception(Mensaje.FECHA_INICIO_FECHA_FIN.name());
        }
        return true;
    }

    public boolean validadFechaInicio (LocalDate fechainicio, LocalDate fechaFin)throws  Exception{
        if (fechaFin.isBefore(fechainicio)){
            throw new Exception(Mensaje.FECHA_INICIO_FECHA_FIN.name());
        }
        return true;
    }
    public boolean validarFormatoFechas (String fecha) throws Exception{
        if (!util.buscarformato(fecha, "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")) {
        throw new Exception(Mensaje.FORMATO_FECHA.name());
        }
        return true;
    }
    public boolean validarCostoPersona (Double costopersona)throws Exception{
        if (costopersona < 0){
            throw new Exception(Mensaje.COSTO_PERSONA.name());
        }
        return true;
    }
}


