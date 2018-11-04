/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Customer {
    private  String nama;
    private  Camera kamera;
    private  jasaKirim jasa;
    private  int hari;
    private  int biaya;

    public Customer(String nama, Camera kamera, jasaKirim jasa, int hari, int biaya) {
        this.nama = nama;
        this.kamera = kamera;
        this.jasa = jasa;
        this.hari = hari;
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Camera getKamera() {
        return kamera;
    }

    public void setKamera(Camera kamera) {
        this.kamera = kamera;
    }

    public jasaKirim getJasa() {
        return jasa;
    }

    public void setJasa(jasaKirim jasa) {
        this.jasa = jasa;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public int totalBiaya(){
        return kamera.biayaSewa(hari) + jasa.biayaKirim(biaya);
    }
}
