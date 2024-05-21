package org.agence.Visite;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Document(collection = "Visite")
public class ModelVisite {
    @MongoId
    private String id;


    private String idBien;

    private String idClient;

    private Date dateVisite;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdBien() {
        return idBien;
    }

    public void setIdBien(String idBien) {
        this.idBien = idBien;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public Date getDateVisite() {
        return dateVisite;
    }

    public void setDateVisite(Date dateVisite) {
        this.dateVisite = dateVisite;
    }
}
