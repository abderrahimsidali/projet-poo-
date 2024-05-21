package org.agence.AgentImmobilier;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAgentImmobilier extends MongoRepository<ModelAgentImmobilier, Long> {
    ModelAgentImmobilier findById(String id);
    void deleteById(String id);
}
