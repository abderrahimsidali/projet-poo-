package org.agence.Client;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoClient extends MongoRepository<ModelClient, Long> {
    ModelClient findById(String id);
    void deleteById(String id);
}
