package com.example.uts_progmob.Model;

public class DataDosen {
    public String nidnNama;
    public String gelar;
    public String alamat;
    public String email;

    public DataDosen(String nidnNama, String gelar, String alamat, String email) {
        this.nidnNama = nidnNama;
        this.gelar = gelar;
        this.alamat = alamat;
        this.email = email;
    }

    public String getNidnNama() {
        return nidnNama;
    }

    public void setNidnNama(String nidnNama) {
        this.nidnNama = nidnNama;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }
}
