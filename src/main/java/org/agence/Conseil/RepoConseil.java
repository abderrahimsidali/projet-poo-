package org.agence.Conseil;


import org.agence.Bien.ModelBien;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoConseil extends MongoRepository<ModelConseil, Long> {
    ModelConseil findById(String id);
    void deleteById(String id);
}
