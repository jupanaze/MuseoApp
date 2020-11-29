/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp.Repositories;

import co.com.mintic.MuseoApp.Model.Museo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juanp
 */
public interface MuseoRepository extends JpaRepository<Museo,Long>  {
    
    List<Museo> findByNombreMuseo(String nombreMuseo);
    
}
