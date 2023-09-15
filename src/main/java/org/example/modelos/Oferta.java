package org.example.modelos;

import org.example.validaciones.OfertaValidacion;

import java.util.Date;
import org.example.utilidades.Util;
import java.time.LocalDate;

public class Oferta {
    private int id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costopersona;
    private int idlocal;

private OfertaValidacion validacion=new OfertaValidacion();
private Util util=new Util();
    public Oferta() {
    }

    public Oferta(int id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costopersona, int idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costopersona = costopersona;
        this.idlocal = idlocal;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", FechaInicio=" + fechaInicio +
                ", FechaFin=" + fechaFin +
                ", costopersona=" + costopersona +
                ", idlocal=" + idlocal +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {

        try {
            this.validacion.validarTitulo(titulo);
            this.titulo=titulo;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        try {
            this.validacion.validarFormatoFechas(fechaInicio);
            this.fechaInicio=this.util.convertitStringEnLocalDate(fechaInicio);

        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try {
            this.validacion.validarFormatoFechas(fechaFin);
            this.validacion.validarTodasFechas(this.fechaInicio,this.util.convertitStringEnLocalDate(fechaFin));
            this.fechaInicio = this.util.convertitStringEnLocalDate(fechaFin);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Double getCostopersona() {
        return costopersona;
    }

    public void setCostopersona(Double costopersona) {
        try {
            this.validacion.validarCostoPersona(costopersona);
            this.costopersona=costopersona;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public int getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(int idlocal) {
        this.idlocal = idlocal;
    }
}
