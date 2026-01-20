package gianmarte.entitles;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "eventi")
public class Evento {

    // LE ANNOTAZIONI VANNO QUI, sopra le variabili
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titolo;

    private LocalDate dataEvento;

    // Costruttore vuoto (Obbligatorio per JPA)
    public Evento() {}

    // Costruttore
    public Evento(String titolo, LocalDate dataEvento) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
    }

    // Getters e Setters (necessari)
    public Long getId() { return id; }
    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }

}