package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.Date;

public class ReservaValidacion {
    private Util util=new Util();

    public boolean validarfecha(String fechareserva) {
        return true;
    }


    public boolean validarNumeroPersonas (int numeropersonas)throws Exception{
        if (numeropersonas > 4){
            throw new Exception(Mensaje.PERSONA_RESERVA.name());
        }
        return true;
    }
}
