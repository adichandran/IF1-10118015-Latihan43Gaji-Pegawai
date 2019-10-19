/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan43gajipegawai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program untuk menghitung gaji pegawai
 */
public class IF110118015Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gp = new GajiPegawai();
        System.out.println("***Data Gaji Karyawan PT. KAKATU***");
        System.out.println("-----------------------------------");
        Scanner input = new Scanner(System.in);
        gp.setNama("Adi Chandra Nugraha");
        gp.setAlamat("Jalan Cicalengka No 192 Cicalengka");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        gp.totalGaji(gp.getUangTunjangan(),gp.getUangTransport(),gp.getGajiPokok());
        gp.tampilData(gp.getNama(), gp.getAlamat(), gp.getUangTunjangan(),gp.getUangTransport(),gp.getGajiPokok(), gp.getTotalGaji());
    }
    
}
