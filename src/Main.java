/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Camera cam = new Camera();
        cam.setNama("Nikon B054");
        cam.setBiaya(150000);
        
        jasaKirim jasa = new jasaKirim();
        jasa.setNamaPerusahaan("JNE");
        jasa.setBiayaKirim(17000);
        
        Customer cus = new Customer();
        cus.setNama("Ali");
        cus.setKamera(cam);
        cus.setJasa(jasa);
        cus.setHari(2);
        System.out.println("Biaya total yang harus anda bayar = " + cus.totalBiaya());
    }
}
