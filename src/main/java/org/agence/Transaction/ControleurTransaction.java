package org.agence.Transaction;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControleurTransaction {
    private final ServiceTransaction serviceTransaction;




    public ControleurTransaction(ServiceTransaction serviceTransaction) {
        this.serviceTransaction = serviceTransaction;
    }
    @GetMapping("/transaction")
    public List<ModelTransaction> trouverTousLesTransactions() {
        return serviceTransaction.trouverTousLesTransactions();
    }


    @GetMapping("/transaction/{id}")
    public ModelTransaction trouverTransactionParId(@PathVariable String id) {
        return serviceTransaction.trouverTransactionParId(id);
    }

    @PostMapping("/transaction")
    public String ajouterTransaction(@RequestBody ModelTransaction transaction) {
        serviceTransaction.ajouterTransaction(transaction);
        return "Transaction ajouté avec succès";
    }

    @DeleteMapping("/transaction/{id}")

    public String supprimerTransaction(@PathVariable String id) {
        serviceTransaction.supprimerTransaction(id);
        return "Transaction supprimé avec succès";
    }

    @PutMapping("/transaction/{id}")
    public String modifierTransaction(@PathVariable String id,@RequestBody ModelTransaction transaction) {
        serviceTransaction.modifierTransaction(id,transaction);
        return "Transaction modifié avec succès";
    }
}
