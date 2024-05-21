package org.agence.AgentImmobilier;


import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class ServiceAgentImmobilier {
    private final RepoAgentImmobilier repoAgentImmobilier;

    public ServiceAgentImmobilier(RepoAgentImmobilier repoAgentImmobilier) {
        this.repoAgentImmobilier = repoAgentImmobilier;
    }

    public List<ModelAgentImmobilier> trouverTousLesAgents() {
        return repoAgentImmobilier.findAll();
    }
    public ModelAgentImmobilier trouverAgentParId(String id) {
        return repoAgentImmobilier.findById(id);
    }

    public void ajouterAgent(ModelAgentImmobilier agent) {
        repoAgentImmobilier.save(agent);
    }

    public void supprimerAgent(String id) {
        repoAgentImmobilier.deleteById(id);

    }

    public void modifierAgent(String id,ModelAgentImmobilier agent) {
        ModelAgentImmobilier agent1 = repoAgentImmobilier.findById(id);

        agent1.setNom(agent.getNom() == null?agent1.getNom():agent.getNom());
        agent1.setPrenom(agent.getPrenom()  == null?agent1.getPrenom():agent.getPrenom());
        agent1.setEmail(agent.getEmail() == null?agent1.getEmail():agent.getEmail());
        agent1.setImage(agent.getImage() == null?agent1.getImage():agent.getImage());



        repoAgentImmobilier.save(agent1);
    }


}
