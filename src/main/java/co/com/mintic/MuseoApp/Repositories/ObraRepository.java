/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp.Repositories;

import co.com.mintic.MuseoApp.Model.Obra;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author juanp
 */
public interface ObraRepository extends JpaRepository<Obra,Long>{
    List<Obra> findByObrTipoOrderByObrNombre(String tipoObra);

    @Query("Select o from Obra o where obrTipo like ?1 order by obrNombre")
    List<Obra> miConsulta (String tipoObra);

    @Query("Select o from Obra o join Presentacion p on o.obrId = p.presentacionId.obra.obrId where p.presentacionId.preFecha like ?1")
    List<Obra> obrasEnMes (String mes);

    //List<Obra> findByExposicion_ExpNombre(String expNombre);
    
}
