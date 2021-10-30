package beanControlador;

import beanModelo.entidadEmpleado;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "controladorEmpleado")
@RequestScoped
public class controladorEmpleado {
private entidadEmpleado _empleado = new entidadEmpleado();
public static List<entidadEmpleado> _empleados = new ArrayList();

    /**
     * Creates a new instance of controladorEmpleado
     */
    public controladorEmpleado() {
    }

    public List<entidadEmpleado> getEmpleados() {
        return _empleados;
    }

    public void setEmpleados(List<entidadEmpleado> _empleados) {
        controladorEmpleado._empleados = _empleados;
    }

    public entidadEmpleado getEmpleado() {
        return _empleado;
    }

    public void setEmpleado(entidadEmpleado _empleado) {
        this._empleado = _empleado;
    }
    
    public void agregar (){
        _empleados.add(_empleado);
        _empleado=new entidadEmpleado();
       
    }
    
    public void eliminar (entidadEmpleado emp){
        _empleados.remove(emp);
        
    } 
}
