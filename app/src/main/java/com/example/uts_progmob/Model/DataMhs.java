package com.example.uts_progmob.Model;

public class DataMhs {
    public String nimNama;
    public String Alamat;
    public String email;

    public DataMhs(String nimNama, String alamat, String email) {
        this.nimNama = nimNama;
        this.Alamat = alamat;
        this.email = email;
    }

    public String getNimNama() {
        return nimNama;
    }

    public void setNimNama(String nimNama) {
        this.nimNama = nimNama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
