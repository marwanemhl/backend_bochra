package tech.getarrays.gestionStagiaires.service;

import org.springframework.stereotype.Service;
import tech.getarrays.gestionStagiaires.exception.UserNotFoundException;
import tech.getarrays.gestionStagiaires.model.Stagiaire;
import tech.getarrays.gestionStagiaires.repo.StagiaireRepo;

import java.util.List;
import java.util.UUID;

@Service
public class StagiaireService {

    private final StagiaireRepo stagiaireRepo;
    public StagiaireService(StagiaireRepo stagiaireRepo)
    {
        this.stagiaireRepo=stagiaireRepo;
    }

    public Stagiaire addStagiaire(Stagiaire stagiaire){
        stagiaire.setStagiaireCode(UUID.randomUUID().toString());
        return stagiaireRepo.save(stagiaire);
    }
    public List<Stagiaire> findAllStagiaires()
    {
        return stagiaireRepo.findAll();

    }

    public Stagiaire updateStagiaire(Stagiaire stagiaire)
    {
        return stagiaireRepo.save(stagiaire);

    }

    public Stagiaire findStagiaireById(Long id)
    {
       return stagiaireRepo.findStagiaireById(id).orElseThrow(()->new UserNotFoundException("User by id "+id+ "was not found "));
    }
    public void deleteStagiaire(Long id){
        stagiaireRepo.deleteById(id);
    }
}
