package org.agence.Bien;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Document(collection = "Bien")
public class ModelBien {
    @MongoId
    private String id;

    private float prix;
    private String adresse;

    private float superficie;

    private Date dateAjout;

    private String nomProprietaire;

    private String prenomProprietaire;

    private String emailProprietaire;

    private String telephoneProprietaire;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getPrenomProprietaire() {
        return prenomProprietaire;
    }

    public void setPrenomProprietaire(String prenomProprietaire) {
        this.prenomProprietaire = prenomProprietaire;
    }

    public String getEmailProprietaire() {
        return emailProprietaire;
    }

    public void setEmailProprietaire(String emailProprietaire) {
        this.emailProprietaire = emailProprietaire;
    }

    public String getTelephoneProprietaire() {
        return telephoneProprietaire;
    }

    public void setTelephoneProprietaire(String telephoneProprietaire) {
        this.telephoneProprietaire = telephoneProprietaire;
    }
}
