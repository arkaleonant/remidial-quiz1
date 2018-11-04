/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class jasaKirim {
    private String namaPerusahaan;
    private int biayaKirim;

    public jasaKirim() {
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public int getBiayaKirim() {
        return biayaKirim;
    }

    public void setBiayaKirim(int biayaKirim) {
        this.biayaKirim = biayaKirim;
    }

    public int biayaKirim(int hari){
        return hari * biayaKirim;
    }
}
