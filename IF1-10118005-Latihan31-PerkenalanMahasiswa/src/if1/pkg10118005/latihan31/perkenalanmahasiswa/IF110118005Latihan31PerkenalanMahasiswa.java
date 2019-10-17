/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan31.perkenalanmahasiswa;

/**
 *
 * @author USER
* NAMA : Rycho Rantung
* KELAS : IF1
* NIM : 10118005
* Deskripsi Program : Berisi program yang menampilkan nim dan nama mahasiswa
 */
public class IF110118005Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
		Mahasiswa mhs1 = new Mahasiswa();
		Mahasiswa mhs2 = new Mahasiswa();
		Mahasiswa mhs3 = new Mahasiswa();
		
		
		
		mhs.nama = "Rizki Adam Kurniawan";
                mhs.nim = "10110269";
                mhs.perkenalkanDiri();
                
                mhs1.nama = "Indra Tiola";
                mhs1.nim = "10110270";
                mhs1.perkenalkanDiri();
                
                mhs2.nama = "Robi Tanzil Ganefi";
                mhs2.nim = "10110271";
                mhs2.perkenalkanDiri();
                
                mhs3.nama = "Muhammad Nur Awaluddin";
                mhs3.nim = "10110269";
                mhs3.perkenalkanDiri();
    }
    
}
