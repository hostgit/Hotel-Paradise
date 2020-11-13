/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hotelparadise.modelo;

/**
 *
 * @author kevin
 */
public class HotelOp {

    private String nombre;
    private String direccion;
    private String estado_civil;
    private String profesion;
    private String despertador;
    private int id_habitacion;
    private String inicio;
    private String fin;
    private String disponibilidad;
    private String telefono;
    private String calefaccion;
    private String baño_priv;
    private String tipo_hab;
    private String correo;
    private String apellidos;
    private String desayuno;
    private int telefono_user;

    
    public void tipohabitacion() {

        try {
            if (this.id_habitacion == 1) {
                this.baño_priv = "no";
                this.calefaccion = "si";
                this.telefono = "no";
                this.disponibilidad = "Si";
                this.tipo_hab = "Simple";
                this.desayuno = this.desayuno;
                this.despertador = this.despertador;

            } else if (this.id_habitacion == 2) {
                this.baño_priv = "si";
                this.calefaccion = "si";
                this.telefono = "si";
                this.disponibilidad = "No";
                this.tipo_hab = "Doble";
                this.desayuno = this.desayuno;
                this.despertador = this.despertador;
            } else if (this.id_habitacion == 3) {
                this.baño_priv = "no";
                this.calefaccion = "si";
                this.telefono = "no";
                this.disponibilidad = "Si";
                this.tipo_hab = "Vip";
                this.desayuno = this.desayuno;
                this.despertador = this.despertador;
            } else if (this.id_habitacion == 0) {
                this.baño_priv = "";
                this.calefaccion = "";
                this.telefono = "";
                this.disponibilidad = "";
                this.tipo_hab = "";
            }

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }

    public void formulario() {

        this.nombre = this.nombre;
        this.direccion = this.direccion;
        this.estado_civil = this.estado_civil;
        this.profesion = this.profesion;
        this.inicio = this.inicio;
        this.fin = this.fin;
        this.apellidos = this.apellidos;
        this.correo = this.correo;
        this.telefono_user = this.telefono_user;

    }

    public HotelOp() {

    }

    public HotelOp(String nomb, String dir, String estado, String prof, String despe, int habit, String ini, String finn, String dispo, String tel, String cale, String bapriv, String tipo_habb, String apellidos, String desayuno, int telefono_user, String correo) {
        this.despertador = despe;
        this.direccion = dir;
        this.disponibilidad = dispo;
        this.estado_civil = estado;
        this.fin = finn;
        this.id_habitacion = habit;
        this.inicio = ini;
        this.nombre = nomb;
        this.profesion = prof;
        this.telefono = tel;
        this.calefaccion = cale;
        this.baño_priv = bapriv;
        this.tipo_hab = tipo_habb;
        this.apellidos = apellidos;
        this.correo = correo;
        this.desayuno = desayuno;
        this.telefono_user = telefono_user;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDespertador() {
        return despertador;
    }

    public void setDespertador(String despertador) {
        this.despertador = despertador;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(String calefaccion) {
        this.calefaccion = calefaccion;
    }

    public String getBaño_priv() {
        return baño_priv;
    }

    public void setBaño_priv(String baño_priv) {
        this.baño_priv = baño_priv;
    }

    public String getTipo_hab() {
        return tipo_hab;
    }

    public void setTipo_hab(String tipo_hab) {
        this.tipo_hab = tipo_hab;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }

    public int getTelefono_user() {
        return telefono_user;
    }

    public void setTelefono_user(int telefono_user) {
        this.telefono_user = telefono_user;
    }

}
