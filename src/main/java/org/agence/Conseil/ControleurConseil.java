package org.agence.Conseil;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControleurConseil {
    private final ServiceConseil serviceConseil;




    public ControleurConseil(ServiceConseil serviceConseil) {
        this.serviceConseil = serviceConseil;
    }
    @GetMapping("/conseil")
    public List<ModelConseil> trouverTousLesConseils() {
        return serviceConseil.trouverTousLesConseils();
    }


    @GetMapping("/conseil/{id}")
    public ModelConseil trouverConseilParId(@PathVariable String id) {
        return serviceConseil.trouverConseilParId(id);
    }

    @PostMapping("/conseil")
    public String ajouterConseil(@RequestBody ModelConseil conseil) {
        serviceConseil.ajouterConseil(conseil);
        return "Conseil ajouté avec succès";
    }

    @DeleteMapping("/conseil/{id}")

    public String supprimerConseil(@PathVariable String id) {
        serviceConseil.supprimerConseil(id);
        return "Conseil supprimé avec succès";
    }

    @PutMapping("/conseil/{id}")
    public String modifierConseil(@PathVariable String id,@RequestBody ModelConseil conseil) {
        serviceConseil.modifierConseil(id,conseil);
        return "Conseil modifié avec succès";
    }
}
