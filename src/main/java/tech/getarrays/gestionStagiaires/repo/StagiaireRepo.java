package tech.getarrays.gestionStagiaires.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.gestionStagiaires.model.Stagiaire;

import java.util.Optional;

public interface StagiaireRepo extends JpaRepository<Stagiaire, Long> {
    void deleteStagiaireById(Long id);

    Optional<Stagiaire> findStagiaireById(Long id);



}
