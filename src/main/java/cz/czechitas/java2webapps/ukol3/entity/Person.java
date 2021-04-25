package cz.czechitas.java2webapps.ukol3.entity;

public class Person {

    private String jmeno;
    private String prijmeni;
    private String firma;
    private String uliceACisloDomu;
    private String pcsAMesto;
    private String email;
    private String telefon;
    private String web;

    // shcvalne z konstruktoru vynechavam email, aby mohl byt null (pro testovaci uvely),
    // ackoliv si myslim, ze by mel mit nejakou default hodnotu pri vzniku objektu
    public Person(String jmeno, String prijmeni, String uliceACisloDomu, String pcsAMesto, String telefon) {
        this(jmeno, prijmeni, "Czechitas z. s.", uliceACisloDomu, pcsAMesto, telefon, "www.czechitas.cz");
    }

    public Person(String jmeno, String prijmeni, String firma, String uliceACisloDomu, String pcsAMesto, String telefon, String web) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.firma = firma;
        this.uliceACisloDomu = uliceACisloDomu;
        this.pcsAMesto = pcsAMesto;
        this.telefon = telefon;
        this.web = web;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getFirma() {
        return firma;
    }

    public String getUliceACisloDomu() {
        return uliceACisloDomu;
    }

    public String getPcsAMesto() {
        return pcsAMesto;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getWeb() {
        return web;
    }

    public String getCeleJmeno() {
        return jmeno + " " + prijmeni;
    }
    public String getCelouAdresu() {
        return uliceACisloDomu + ", " + pcsAMesto;
    }
}


