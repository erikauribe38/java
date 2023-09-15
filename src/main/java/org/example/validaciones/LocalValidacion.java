package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class LocalValidacion {

    public Boolean validarNit (String nit) throws Exception {
        if (nit.length() != 10 ){
            throw new Exception(Mensaje.LONGITUD_NIT.getMensaje());
        }
        return true;
    }

    public  Boolean validarNombre(String nombre)throws Exception{
        if (nombre.length() > 30 ){
            throw new Exception(Mensaje.LONGITUD_EMPRESA.getMensaje());
        }
        return true;
    }
}
