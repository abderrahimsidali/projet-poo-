package org.agence.Visite;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceVisite {
    private final RepoVisite repoVisite;

    public ServiceVisite(RepoVisite repoVisite) {
        this.repoVisite = repoVisite;
    }

    public List<ModelVisite> trouverTousLesVisites() {
        return repoVisite.findAll();
    }
    public ModelVisite trouverVisiteParId(String id) {
        return repoVisite.findById(id);
    }

    public void ajouterVisite(ModelVisite visite) {
        repoVisite.save(visite);
    }

    public void supprimerVisite(String id) {
        repoVisite.deleteById(id);
    }

    public void modifierVisite(String id,ModelVisite visite) {
        ModelVisite visite1 = repoVisite.findById(id);

        visite1.setIdBien(visite.getIdBien() == null?visite1.getIdBien():visite.getIdBien());

        visite1.setIdClient(visite.getIdClient() == null?visite1.getIdClient():visite.getIdClient());

        visite1.setDateVisite(visite.getDateVisite() == null?visite1.getDateVisite():visite.getDateVisite());






        repoVisite.save(visite1);
    }


}
