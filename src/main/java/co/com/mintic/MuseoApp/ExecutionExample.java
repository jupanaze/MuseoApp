/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp;

import co.com.mintic.MuseoApp.Model.Museo;
import co.com.mintic.MuseoApp.Model.Obra;
import co.com.mintic.MuseoApp.Repositories.MuseoRepository;
import co.com.mintic.MuseoApp.Repositories.ObraRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author juanp
 */
@Component
public class ExecutionExample implements CommandLineRunner {
    
    @Autowired
    private MuseoRepository museoRepository;
    
    @Autowired
    private ObraRepository obraRepository;
    
    private static final Logger logger = LoggerFactory.getLogger(ExecutionExample.class);
    
    @Override
    public void run (String... args) throws Exception{
        List<Obra> pinturas = obraRepository.findByObrTipoOrderByObrNombre("pintura");
        for (Obra pintura: pinturas){
            logger.info(pintura.toString());
        }
        
        logger.info("***********");
        
        pinturas = obraRepository.miConsulta("pintura");
        for (Obra pintura: pinturas){
            logger.info(pintura.toString());
        }
        
        logger.info("***********");
        List<Obra> obras2 = obraRepository.obrasEnMes("%ene%");
        for (Obra pintura: obras2){
            logger.info(pintura.toString());
        }
        



//        Optional<Museo> optMuseo = museoRepository.findById(101L);
//        
//        if(optMuseo.isPresent())
//            logger.debug("Nombre del museo: {}", optMuseo.get().getNombreMuseo());
//        else
//            logger.info("No existe un museo con el id especificado {}");
//        
//        logger.info("Cantidad de museos: {}",Long.toString(museoRepository.count()));
//        
//        List<Museo> museos = museoRepository.findAll();
//        
//        for (Museo museo : museos){
//            logger.info("Id: {} Nombre: {}", museo.getMusId(), museo.getNombreMuseo());
//        }
//        
//    Museo m = new Museo();
//    m.setMusId(103L);
//    m.setNombreMuseo("Museo nacional");
//    museoRepository.save(m);    
//    
    }
    
    
           
        
    
}
