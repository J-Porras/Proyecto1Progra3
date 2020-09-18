/*
 * 
 */
package logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

/**
 * Administración de provincias, cantones y distritos.
 * //por motivos de complejidad los distritos y detalles han sido removidos 5/Septiembre
 * @author Joaquin
 */


@XmlAccessorType(XmlAccessType.FIELD)

public class Ubicacion {
    private String provincia; 
    private String canton;

    public Ubicacion(String provincia, String canton) {
        this.provincia = provincia;
        this.canton = canton;  
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCanton() {
        return canton;
    }
    
    
    
} 
