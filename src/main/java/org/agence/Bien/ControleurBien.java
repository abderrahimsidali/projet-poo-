package org.agence.Bien;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControleurBien {
    private final ServiceBien serviceBien;




    public ControleurBien(ServiceBien serviceBien) {
        this.serviceBien = serviceBien;
    }
    @GetMapping("/bien")
    public List<ModelBien> trouverTousLesBiens() {
        return serviceBien.trouverTousLesBiens();
    }


    @GetMapping("/bien/{id}")
    public ModelBien trouverBienParId(@PathVariable String id) {
        return serviceBien.trouverBienParId(id);
    }

    @PostMapping("/bien")
    public String ajouterBien(@RequestBody ModelBien bien) {
        serviceBien.ajouterBien(bien);
        return "Bien ajouté avec succès";
    }

    @DeleteMapping("/bien/{id}")

    public String supprimerBien(@PathVariable String id) {
        serviceBien.supprimerBien(id);
        return "Bien supprimé avec succès";
    }

    @PutMapping("/bien/{id}")
    public String modifierBien(@PathVariable String id,@RequestBody ModelBien bien) {
        serviceBien.modifierBien(id,bien);
        return "Bien modifié avec succès";
    }
}
