package pt.iade.geotest.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pt.iade.geotest.models.Store;
import pt.iade.geotest.models.views.StoreView;

public interface StoresRepository extends CrudRepository<Store,Integer>{
    @Query(value=
    "Select loj_id as id, loj_name as name, loc_name as localName, "+
    "loc_local[0] as lat, loc_local[1] as lon from lojas "+
    "inner join locais on loj_loc_id = loc_id"
    , nativeQuery=true) 
    Iterable<StoreView> findAllLojasWithLocation();   


}
