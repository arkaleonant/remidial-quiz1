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

    public Customer() {

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
    
    public int totalBiaya(){
        return kamera.biayaSewa(hari) + jasa.biayaKirim(hari);
    }
}
