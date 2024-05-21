package org.agence.Conseil;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceConseil {
    private final RepoConseil repoConseil;

    public ServiceConseil(RepoConseil repoConseil) {
        this.repoConseil = repoConseil;
    }

    public List<ModelConseil> trouverTousLesConseils() {
        return repoConseil.findAll();
    }
    public ModelConseil trouverConseilParId(String id) {
        return repoConseil.findById(id);
    }

    public void ajouterConseil(ModelConseil conseil) {
        repoConseil.save(conseil);
    }

    public void supprimerConseil(String id) {
        repoConseil.deleteById(id);
    }

    public void modifierConseil(String id,ModelConseil conseil) {
        ModelConseil conseil1 = repoConseil.findById(id);



        conseil1.setId_bien(conseil.getId_bien() == null?conseil1.getId_bien():conseil.getId_bien());

        conseil1.setId_client(conseil.getId_client() == null?conseil1.getId_client():conseil.getId_client());

        conseil1.setConseil(conseil.getConseil() == null?conseil1.getConseil():conseil.getConseil());



        repoConseil.save(conseil1);
    }


}
