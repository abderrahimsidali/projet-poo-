package org.agence.Client;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControleurClient {
    private final ServiceClient serviceClient;




    public ControleurClient(ServiceClient serviceClient) {
        this.serviceClient = serviceClient;
    }
    @GetMapping("/client")
    public List<ModelClient> trouverTousLesClients() {
        return serviceClient.trouverTousLesClients();
    }


    @GetMapping("/client/{id}")
    public ModelClient trouverClientParId(@PathVariable String id) {
        return serviceClient.trouverClientParId(id);
    }

    @PostMapping("/client")
    public String ajouterClient(@RequestBody ModelClient client) {
        serviceClient.ajouterClient(client);
        return "Client ajouté avec succès";
    }

    @DeleteMapping("/client/{id}")

    public String supprimerClient(@PathVariable String id) {
        serviceClient.supprimerClient(id);
        return "Client supprimé avec succès";
    }

    @PutMapping("/client/{id}")
    public String modifierClient(@PathVariable String id,@RequestBody ModelClient client) {
        serviceClient.modifierClient(id,client);
        return "Client modifié avec succès";
    }
}
