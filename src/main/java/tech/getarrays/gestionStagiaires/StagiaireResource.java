package tech.getarrays.gestionStagiaires;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.gestionStagiaires.model.Stagiaire;
import tech.getarrays.gestionStagiaires.service.StagiaireService;

import java.util.List;

@RestController
@RequestMapping("/stagiaire")

public class StagiaireResource {
    private final StagiaireService stagiaireService;
    public StagiaireResource(StagiaireService stagiaireService)
    {
        this.stagiaireService=stagiaireService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Stagiaire>> getAllStagiaires(){
        List<Stagiaire> stagiaires = stagiaireService.findAllStagiaires();
        return new ResponseEntity<>(stagiaires, HttpStatus.OK);


    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Stagiaire> getStagiaireById(@PathVariable("id") Long id){
        Stagiaire stagiaire = stagiaireService.findStagiaireById(id);
        return new ResponseEntity<>(stagiaire, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Stagiaire> addStagiaire(@RequestBody Stagiaire stagiaire)
    {
        Stagiaire newStagiaire = stagiaireService.addStagiaire(stagiaire);
        return new ResponseEntity<>(newStagiaire, HttpStatus.CREATED);

    }
    @PutMapping("/update")
    public ResponseEntity<Stagiaire> updateStagiaire(@RequestBody Stagiaire stagiaire)
    {
        Stagiaire updateStagiaire = stagiaireService.updateStagiaire(stagiaire);
        return new ResponseEntity<>(updateStagiaire, HttpStatus.CREATED);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Stagiaire> deleteStagiaire(@PathVariable("id") Long id)
    {
         stagiaireService.deleteStagiaire(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
