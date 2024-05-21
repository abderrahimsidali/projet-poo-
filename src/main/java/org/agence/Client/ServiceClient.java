package org.agence.Client;


import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class ServiceClient {
    private final RepoClient repoClient;

    public ServiceClient(RepoClient repoClient) {
        this.repoClient = repoClient;
    }

    public List<ModelClient> trouverTousLesClients() {
        return repoClient.findAll();
    }
    public ModelClient trouverClientParId(String id) {
        return repoClient.findById(id);
    }

    public void ajouterClient(ModelClient client) {
        repoClient.save(client);
    }

    public void supprimerClient(String id) {
        repoClient.deleteById(id);
    }

    public void modifierClient(String id,ModelClient client) {
        ModelClient client1 = repoClient.findById(id);

        client1.setNom(client.getNom() == null?client1.getNom():client.getNom());
        client1.setPrenom(client.getPrenom() == null?client1.getPrenom():client.getPrenom());
        client1.setEmail(client.getEmail() == null?client1.getEmail():client.getEmail());
        client1.setTelephone(client.getTelephone() == null?client1.getTelephone():client.getTelephone());



        repoClient.save(client1);
    }


}
