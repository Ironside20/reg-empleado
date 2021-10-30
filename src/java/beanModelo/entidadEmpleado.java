/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanModelo;

/**
 *
 * @author Elvis
 */
public class entidadEmpleado {
    
    private String _cedula, _nombre, _apellidos, _direccion, _observacion, _nacionalidad;
    private int _edad;

    public String getCedula() {
        return _cedula;
    }

    public void setCedula(String _cedula) {
        this._cedula = _cedula;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellidos() {
        return _apellidos;
    }

    public void setApellidos(String _apellidos) {
        this._apellidos = _apellidos;
    }

    public String getDireccion() {
        return _direccion;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }

    public String getObservacion() {
        return _observacion;
    }

    public void setObservacion(String _observacion) {
        this._observacion = _observacion;
    }

    public String getNacionalidad() {
        return _nacionalidad;
    }

    public void setNacionalidad(String _nacionalidad) {
        this._nacionalidad = _nacionalidad;
    }

    public int getEdad() {
        return _edad;
    }

    public void setEdad(int _edad) {
        this._edad = _edad;
    }
    
    
}
