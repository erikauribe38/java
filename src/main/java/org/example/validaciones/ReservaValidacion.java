package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.util.Date;

public class ReservaValidacion {
private Util util=new Util();
    public boolean validarFormatoFechas(String fechareserva) throws Exception {
        if (!util.buscarFormato(fechareserva, "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$")){
            throw new Exception(Mensaje.FORMATO_FECHAS.getMensaje());
        }
        return true;
    }

    public boolean validarNumeroPersonas (int numeropersonas)throws  Exception {
        if (numeropersonas > 4) {
            throw new Exception(Mensaje.PERSONA_RESERVA.getMensaje());
        }
        return true;
    }
}
