package tech.getarrays.gestionStagiaires.model;


import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Stagiaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String nom;
    private String prenom;
    private String email;

    public Stagiaire(String nom) {
        this.nom = nom;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Stagiaire(long id) {
        this.id = id;
    }

    public Stagiaire() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getStagiaireCode() {
        return stagiaireCode;
    }

    public void setStagiaireCode(String stagiaireCode) {
        this.stagiaireCode = stagiaireCode;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    private String tel;
    private String competence;
    private String imageUrl;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Column(nullable = false, updatable = false)
    private String stagiaireCode;

    @Override
    public String toString() {
        return "Stagiaire{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", competence='" + competence + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", stagiaireCode='" + stagiaireCode + '\'' +
                '}';
    }
}
