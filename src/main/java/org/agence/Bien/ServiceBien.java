package org.agence.Bien;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBien {
    private final RepoBien repoBien;

    public ServiceBien(RepoBien repoBien) {
        this.repoBien = repoBien;
    }

    public List<ModelBien> trouverTousLesBiens() {
        return repoBien.findAll();
    }
    public ModelBien trouverBienParId(String id) {
        return repoBien.findById(id);
    }

    public void ajouterBien(ModelBien bien) {
        repoBien.save(bien);
    }

    public void supprimerBien(String id) {
        repoBien.deleteById(id);
    }

    public void modifierBien(String id,ModelBien bien) {
        ModelBien bien1 = repoBien.findById(id);

        bien1.setPrix(bien.getPrix()==0?bien1.getPrix():bien.getPrix());

        bien1.setAdresse(bien.getAdresse() == null?bien1.getAdresse():bien.getAdresse());

        bien1.setSuperficie(bien.getSuperficie() == 0?bien1.getSuperficie():bien.getSuperficie());

        bien1.setDateAjout(bien.getDateAjout() == null?bien1.getDateAjout():bien.getDateAjout());

        bien1.setNomProprietaire(bien.getNomProprietaire() == null?bien1.getNomProprietaire():bien.getNomProprietaire());

        bien1.setPrenomProprietaire(bien.getPrenomProprietaire() == null?bien1.getPrenomProprietaire():bien.getPrenomProprietaire());

        bien1.setTelephoneProprietaire(bien.getTelephoneProprietaire() == null?bien1.getTelephoneProprietaire():bien.getTelephoneProprietaire());

        bien1.setEmailProprietaire(bien.getEmailProprietaire() == null?bien1.getEmailProprietaire():bien.getEmailProprietaire());









        repoBien.save(bien1);
    }


}
