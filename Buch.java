package de.ingeJavaTeam.entities;

public class Buch {

    private String isbn;
    private String autor;
    private String titel;
    private String verlag;
    private Integer anzahlverfuegbar;
    private String bild;
    private String beschreibung;
    private String abteilung;

    public Buch(String isbn, String autor, String titel, String verlag,
                Integer anzahlverfuegbar, String bild, String beschreibung, String abteilung) {
        this.isbn = isbn;
        this.autor = autor;
        this.titel = titel;
        this.verlag = verlag;
        this.anzahlverfuegbar = anzahlverfuegbar;
        this.bild = bild;
        this.beschreibung = beschreibung;
        this.abteilung = abteilung;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", titel='" + titel + '\'' +
                ", verlag='" + verlag + '\'' +
                ", anzahlverfuegbar=" + anzahlverfuegbar +
                ", bild='" + bild + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", abteilung='" + abteilung + '\'' +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    public Integer getAnzahlverfuegbar() {
        return anzahlverfuegbar;
    }

    public void setAnzahlverfuegbar(Integer anzahlverfuegbar) {
        this.anzahlverfuegbar = anzahlverfuegbar;
    }

    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
}
