package org.example.utilidades;

public enum Mensaje {
    FORMATO_NOMBRE("revise el formato del nombre ingresado"),
    LONGITUD_NOMBRE("Numero de caracteres debe ser mayor de 10"),
    UBICACION("La ubicación debe ser un número (1-4)(zona centro, sur, norte y\n" +
            "otras)"),
    CORREO("Se debe validar que el correo sea un correo valido"),
    LONGITUD_NIT("El campo nit debe tener solo 10 dígitos"),
    NOMBRE_EMPRESA("El nombre de la empresa no puede sobrepasar los 30 caracteres"),
    TITULO_OFERTA("El titulo de la oferta no puede sobrepasar los 20 caracteres"),
    FECHA_INICIO_FECHA_FIN("La fecha de inicio no puede ser mayor que la fecha de fin"),
    FORMATO_FECHA("Todas las fechas deben tener el formato (DD/MM/YYYY)"),
    COSTO_PERSONA("El costo por persona no puede ser negativo"),
    PERSONA_RESERVA("El número de personas por reserva no puede ser mayor a 4\n" +
            "personas");
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
