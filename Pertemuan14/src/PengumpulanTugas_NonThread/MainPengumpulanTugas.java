/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengumpulanTugas_NonThread;

/**
 *
 * @author Asus
 */

public class MainPengumpulanTugas {
    public static void main(String[] args) {
        PengumpulanTugas siswa1 = new PengumpulanTugas("Tommy");
        PengumpulanTugas siswa2 = new PengumpulanTugas("Newtie");
        PengumpulanTugas siswa3 = new PengumpulanTugas("Minho");
        
        siswa1.MengerjakanTugas();
        siswa2.MengerjakanTugas();
        siswa3.MengerjakanTugas();
    }
}
