/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp.Repositories;

import co.com.mintic.MuseoApp.Model.Presentacion;
import co.com.mintic.MuseoApp.Model.PresentacionId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juanp
 */
public interface PresentacionRepository extends JpaRepository<Presentacion,PresentacionId>{
    
}
