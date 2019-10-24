package com.example.uts_progmob.Model;

public class DataDosen {
    public String nidnNama;
    public String gelar;
    public String Alamat;
    public String Email;

    public DataDosen(String nidnNama, String gelar, String alamat, String email) {
        this.nidnNama = nidnNama;
        this.gelar = gelar;
        this.Alamat = alamat;
        this.Email = email;
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
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
