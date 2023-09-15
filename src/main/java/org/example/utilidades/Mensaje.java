package org.example.utilidades;

public enum Mensaje {
    FORMATO_NOMBRE("Revise el formato del nombre ingresado"),
    LONGITUD_NOMBRE("Numero de caracteres debe ser mayor de 10"),
    VALIDAR_UBICACION("La ubicación debe ser un número (1-4)(zona centro, sur, norte y otras)"),
    VALIDACION_CORREO("El correo no es valido"),
    LONGITUD_NIT("La longitud del nit debe ser igual 10 caracteres"),
    LONGITUD_EMPRESA("el nombre no puede tener mas de 30 caracteres"),
    LONGITUD_OFERTA("El titulo de la oferta no puede sobrepasar los 20 caracteres"),
    DIFERENCIA_FECHAS("La fecha de inicio no puede ser mayor que la fecha de fin"),
    FORMATO_FECHAS("La fecha deben tener el formato (DD/MM/YYYY)"),
    COSTO_PERSONA("El costo por persona no puede ser negativo"),
    PERSONA_RESERVA("El número de personas por reserva no puede ser mayor a 4 personas");


    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
