package org.agence.Transaction;


import org.agence.Transaction.ModelTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoTransaction extends MongoRepository<ModelTransaction, Long> {
    ModelTransaction findById(String id);
    void deleteById(String id);
}
