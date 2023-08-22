package org.example.utilidades;
import org.example.modelos.Local;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;
public class Util {
    public boolean buscarConcidencia(String cadena, String expresionRegular){
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher concidencia= patron.matcher(cadena);
        if(concidencia.matches()){
            return true;
        }else {
            return false;
        }

    }
    public  Boolean buscarformato(String fecha, String exprecionRegular){
        Pattern patron=Pattern.compile (exprecionRegular);
        Matcher concidencia= patron.matcher(fecha);
        if (concidencia.matches()){
            return true;
        }else {
            return false;
        }
    }
    public LocalDate convertitStringEnLocalDate(String fecha){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM.yyyy");
          LocalDate nuevaFecha=LocalDate.parse(fecha,formatter);
        return nuevaFecha;
    }
}
