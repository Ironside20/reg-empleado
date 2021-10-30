/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanUtilidades;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Ironside
 */
public class controladorValidadciones implements Validator{
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String cedula =(String)value;
        if (cedula.trim().length()==10) {
            throw new ValidatorException(new FacesMessage("Ingrese la " + component.getId() + "para su registro"));
        }else if (cedula.trim().length()<10){
                    throw new ValidatorException(new FacesMessage("Faltan digitos a la cedula "));
                    }
        }
}
