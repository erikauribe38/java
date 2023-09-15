package org.example.utilidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    Util util= new  Util();

    @Test
    public void ConvertirTextoAFechaLocal() {
        String fecha = "07-08.2021";
        int año = 2021;
        int mes = 8;
        int dia = 7;
        LocalDate valor = util.convertitStringEnLocalDate(fecha);
        assertEquals(año, valor.getYear());
        assertEquals(mes, valor.getMonthValue());
        assertEquals(dia, valor.getDayOfMonth());
    }
}






