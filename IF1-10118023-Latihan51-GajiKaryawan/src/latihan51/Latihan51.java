/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan51;
import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Gaji Karyawan
 */

public class Latihan51 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Manager mngr = new Manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");mngr.setNik(input.nextLine());
        System.out.print("Masukkan Nama : ");mngr.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");mngr.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");mngr.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");mngr.setKehadiran(input.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t\t: " + mngr.getNik());
        System.out.println("NAMA\t\t: " + mngr.getNama());
        System.out.println("GOLONGAN\t: " + mngr.getGolongan());
        System.out.println("JABATAN\t\t: " + mngr.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t\t: " + mngr.tunjanganGolongan(mngr.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t\t: " + mngr.tunjanganJabatan(mngr.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t\t: " + mngr.tunjanganKehadiran(mngr.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t\t: " + mngr.gajiTotal());
    }
    
}
