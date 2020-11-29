/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author juanp
 */
@Entity
@Table(name = "museo")
public class Museo {
    
    @Id
    @Column(name= "mus_id")
    private Long musId;
    
    @Column(name = "mus_nombre")
    private String nombreMuseo;
    
    public Long getMusId() {
        return musId;
    }

    public void setMusId(Long musId) {
        this.musId = musId;
    }

    public String getNombreMuseo() {
        return nombreMuseo;
    }

    public void setNombreMuseo(String nombreMuseo) {
        this.nombreMuseo = nombreMuseo;
    }
    
    
    
}
