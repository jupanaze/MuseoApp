/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp.Model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author juanp
 */
@Entity
@Table ( name = "presentacion")
public class Presentacion {
    
    @EmbeddedId
    private PresentacionId presentacionId;

    public PresentacionId getPresentacionId() {
        return presentacionId;
    }

    public void setPresentacionId(PresentacionId presentacionId) {
        this.presentacionId = presentacionId;
    }
    
            
    
    
    
}
