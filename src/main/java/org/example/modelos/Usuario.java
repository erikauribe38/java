package org.example.modelos;

import org.example.validaciones.UsuarioValidacion;



public class Usuario {
    //Atributos=variables=datos
    private int id;
    private String documento;
    private String nombre;
    private int ubicacion;
    private String correoElectronico;

    private UsuarioValidacion validacion=new UsuarioValidacion();


    public Usuario() {
    }

    public Usuario(int id, String documento, String nombre, int ubicacion, String correoElectronico) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ubicacion=" + ubicacion +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {this.documento = documento;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
       try {
           this.validacion.validarNombre(nombre);
           this.nombre=nombre;

       }catch (Exception error){
           System.out.println(error.getMessage());
       }
    }

    public int getUbicacion() {return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        try {
            this.validacion.validarUbicacion(ubicacion);
            this.ubicacion=ubicacion;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico){
        try {
            this.validacion.validarCorreo(correoElectronico);
            this.correoElectronico=correoElectronico;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
