package com.hayankhrisna.tugasakhir.Login;

public class Siswa {

    private String namalengkap;
    private String nama;
    private String pass;


    public Siswa(){

    }

    public Siswa(String namalengkap, String nama, String pass){
        this.namalengkap = namalengkap;
        this.nama = nama;
        this.pass = pass;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }
}
