package org.agence.Bien;


import org.agence.Bien.ModelBien;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoBien extends MongoRepository<ModelBien, Long> {
    ModelBien findById(String id);
    void deleteById(String id);
}
