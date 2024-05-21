package org.agence.Conseil;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Document(collection = "Bien")
public class ModelConseil {
    @MongoId
    private String id;

    private String id_bien;

    private String id_client;

    private String conseil;


    public String getId_bien() {
        return id_bien;
    }

    public void setId_bien(String id_bien) {
        this.id_bien = id_bien;
    }

    public String getId_client() {
        return id_client;
    }

    public void setId_client(String id_client) {
        this.id_client = id_client;
    }

    public String getConseil() {
        return conseil;
    }

    public void setConseil(String conseil) {
        this.conseil = conseil;
    }
}
