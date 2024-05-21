package org.agence.AgentImmobilier;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControleurAgentImmobilier {
    private final ServiceAgentImmobilier serviceAgentImmobilier;




    public ControleurAgentImmobilier(ServiceAgentImmobilier serviceAgentImmobilier) {
        this.serviceAgentImmobilier = serviceAgentImmobilier;
    }
    @GetMapping("/agentimmobilier")
    public List<ModelAgentImmobilier> trouverTousLesAgents() {
        return serviceAgentImmobilier.trouverTousLesAgents();
    }


    @GetMapping("/agentimmobilier/{id}")
    public ModelAgentImmobilier trouverAgentParId(@PathVariable String id) {
        return serviceAgentImmobilier.trouverAgentParId(id);
    }

    @PostMapping("/agentimmobilier")
    public String ajouterAgent(@RequestBody ModelAgentImmobilier agent) {
        serviceAgentImmobilier.ajouterAgent(agent);
        return "Agent ajouté avec succès";
    }

    @DeleteMapping("/agentimmobilier/{id}")

    public String supprimerAgent(@PathVariable String id) {
        serviceAgentImmobilier.supprimerAgent(id);
        return "Agent supprimé avec succès";
    }

    @PutMapping("/agentimmobilier/{id}")
    public String modifierAgent(@PathVariable String id,@RequestBody ModelAgentImmobilier agent) {
        serviceAgentImmobilier.modifierAgent(id,agent);
        return "Agent modifié avec succès";
    }


}
