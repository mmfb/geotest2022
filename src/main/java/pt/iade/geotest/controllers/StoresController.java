package pt.iade.geotest.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.geotest.models.Store;
import pt.iade.geotest.models.repositories.StoresRepository;
import pt.iade.geotest.models.views.StoreView;

@RestController
@RequestMapping(path = "/api/stores")
public class StoresController {
    private Logger logger = LoggerFactory.getLogger(StoresController.class);
    @Autowired
    private StoresRepository unitRepository;
    
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Store> getStores() {
        logger.info("Sending all stores (no coordinates)");
        return unitRepository.findAll();
    }
    
    @GetMapping(path = "/coordinates", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<StoreView> getStoresWithCoordinates() {
        logger.info("Sending all stores (no coordinates)");
        return unitRepository.findAllLojasWithLocation();
    }
}
