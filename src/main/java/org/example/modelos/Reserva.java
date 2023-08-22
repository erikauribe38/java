package org.example.modelos;

import org.example.utilidades.Util;
import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.util.Date;

public class Reserva {
    private int id;
    private int idusuario;
    private int idoferta;
    private double costototal;
    private LocalDate fechareserva;

    private int numeropersonas;
    private ReservaValidacion validacion = new ReservaValidacion();
    private Util util = new Util();

    public Reserva() {
    }

    public Reserva(int id, int idusuario, int idoferta, double costototal, LocalDate fechareserva, int numeropersonas) {
        this.id = id;
        this.idusuario = idusuario;
        this.idoferta = idoferta;
        this.costototal = costototal;
        this.fechareserva = fechareserva;
        this.numeropersonas = numeropersonas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idusuario=" + idusuario +
                ", idoferta=" + idoferta +
                ", costototal=" + costototal +
                ", fechareserva=" + fechareserva +
                ", numeropersonas=" + numeropersonas +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdoferta() {
        return idoferta;
    }

    public void setIdoferta(int idoferta) {
        this.idoferta = idoferta;
    }

    public double getCostototal() {
        return costototal;
    }

    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }

    public LocalDate getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(String fechareserva) {
        try {
            this.validacion.validarfecha(fechareserva);
            this.fechareserva = this.util.convertitStringEnLocalDate(fechareserva);

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }


    public int getNumeropersonas() {
        return numeropersonas;
    }

    public void setNumeropersonas(int numeropersonas) {
        try {
            this.validacion.validarNumeroPersonas(numeropersonas);
            this.numeropersonas = numeropersonas;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}


