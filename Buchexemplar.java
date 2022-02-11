package de.ingeJavaTeam.entities;

import java.time.LocalDate;

public class Buchexemplar {
    private Integer lfdNr;
    private LocalDate ausleihenDatum;
    private Buch buch;
    private Mitglied mitglied;


    public Buchexemplar(Buch buch, Integer lfdNr) {
        this.buch = buch;
        this.lfdNr = lfdNr;

    }

    @Override
    public String toString() {
        return "Buchexemplar{" +
                "lfdNr=" + lfdNr +
                ", ausleihenDatum=" + ausleihenDatum +
                ", buch=" + buch +
                ", mitglied=" + mitglied +
                '}';
    }

    // nur hat Getter
    public LocalDate getAusleihenDatum() {
        return ausleihenDatum;
    }

    public Integer getLfdNr() {
        return lfdNr;
    }

    public void setLfdNr(Integer lfdNr) {
        this.lfdNr = lfdNr;
    }
}
