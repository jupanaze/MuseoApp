/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author juanp
 */
@Entity
@Table(name="")
public class Exposicion {
    
    @Id
    private Long expId;
    private String expNombre;

    public Long getExpId() {
        return expId;
    }

    public void setExpId(Long expId) {
        this.expId = expId;
    }

    public String getExpNombre() {
        return expNombre;
    }

    public void setExpNombre(String expNombre) {
        this.expNombre = expNombre;
    }

    
            
    
    
            }
