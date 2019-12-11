package co.simplon.apidemo.model;

import java.time.LocalDate;

public class Person {

    private final String nom;
    private final String prenom;
    private final String secuSociale;
    private final LocalDate dateNaissance;

    public Person(String nom, String prenom, String secuSociale, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.secuSociale = secuSociale;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSecuSociale() {
        return secuSociale;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", secuSociale='" + secuSociale + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
