package org.agence.Transaction;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTransaction {
    private final RepoTransaction repoTransaction;

    public ServiceTransaction(RepoTransaction repoTransaction) {
        this.repoTransaction = repoTransaction;
    }

    public List<ModelTransaction> trouverTousLesTransactions() {
        return repoTransaction.findAll();
    }
    public ModelTransaction trouverTransactionParId(String id) {
        return repoTransaction.findById(id);
    }

    public void ajouterTransaction(ModelTransaction transaction) {
        repoTransaction.save(transaction);
    }

    public void supprimerTransaction(String id) {
        repoTransaction.deleteById(id);
    }

    public void modifierTransaction(String id,ModelTransaction transaction) {
        ModelTransaction transaction1 = repoTransaction.findById(id);

        transaction1.setIdBien(transaction.getIdBien() == null?transaction1.getIdBien():transaction.getIdBien());
        transaction1.setIdClient(transaction.getIdClient() == null?transaction1.getIdClient():transaction.getIdClient());
        transaction1.setMontant(transaction.getMontant() <0?transaction1.getMontant():transaction.getMontant());
        transaction1.setDateTransaction(transaction.getDateTransaction() == null?transaction1.getDateTransaction():transaction.getDateTransaction());
        transaction1.setFraisAgence(transaction.getFraisAgence() <0?transaction1.getFraisAgence():transaction.getFraisAgence());
        transaction1.setDescription(transaction.getDescription() == null?transaction1.getDescription():transaction.getDescription());



        repoTransaction.save(transaction1);
    }


}
