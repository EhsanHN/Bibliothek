package de.ingeJavaTeam.entities;

import java.util.ArrayList;
import java.util.List;

public class Mitglied {
    private Integer idm;
    private String vorname;
    private String nachname;
    private String adresse;
    private String email;
    private String password;
    private String tel;
    private List<Buchexemplar> ausgelieheneBuecher = new ArrayList<>();

    public Mitglied(Integer idm, String vorname, String nachname, String adresse, String email,
                    String password, String tel) {
        this.idm = idm;
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
        this.email = email;
        this.password = password;
        this.tel = tel;

    }

    @Override
    public String toString() {
        return "Mitglied{" +
                "idm=" + idm +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", ausgelieheneBuecher=" + ausgelieheneBuecher +
                '}';
    }

    // es hat nur getter
    public List<Buchexemplar> getAusgelieheneBuecher() {
        return ausgelieheneBuecher;
    }

    public Integer getIdm() {
        return idm;
    }

    public void setIdm(Integer idm) {
        this.idm = idm;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}