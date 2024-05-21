package org.agence.Visite;


import org.agence.Visite.ModelVisite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoVisite extends MongoRepository<ModelVisite, Long> {
    ModelVisite findById(String id);
    void deleteById(String id);
}
