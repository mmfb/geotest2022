package pt.iade.geotest.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity 
@Table(name="lojas")
public class Store {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="loj_id")    
    private int id;
    @Column(name="loj_name")  
    private String name;
    @Column(name="loj_loc_id")    
    private int idLocal;
    public Store(){}
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    //@JsonIgnore
    public int getIdLocal() {
        return idLocal;
    }
    
}
