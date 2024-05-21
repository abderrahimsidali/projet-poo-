package org.agence.Visite;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControleurVisite {
    private final ServiceVisite serviceVisite;




    public ControleurVisite(ServiceVisite serviceVisite) {
        this.serviceVisite = serviceVisite;
    }
    @GetMapping("/visite")
    public List<ModelVisite> trouverTousLesVisites() {
        return serviceVisite.trouverTousLesVisites();
    }


    @GetMapping("/visite/{id}")
    public ModelVisite trouverVisiteParId(@PathVariable String id) {
        return serviceVisite.trouverVisiteParId(id);
    }

    @PostMapping("/visite")
    public String ajouterVisite(@RequestBody ModelVisite visite) {
        serviceVisite.ajouterVisite(visite);
        return "Visite ajouté avec succès";
    }

    @DeleteMapping("/visite/{id}")

    public String supprimerVisite(@PathVariable String id) {
        serviceVisite.supprimerVisite(id);
        return "Visite supprimé avec succès";
    }

    @PutMapping("/visite/{id}")
    public String modifierVisite(@PathVariable String id,@RequestBody ModelVisite visite) {
        serviceVisite.modifierVisite(id,visite);
        return "Visite modifié avec succès";
    }
}
