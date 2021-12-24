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

public class PengumpulanTugas {
    private String namaSiswa;
    
    public PengumpulanTugas (String namaSiswa) {
        this.namaSiswa = namaSiswa;
        System.out.println(namaSiswa + " diberikan tugas sebanyak 5 soal");
    }
    
    public void MengerjakanTugas() {
        System.out.println(namaSiswa + " mulai mengerjakan soal");
            for (int i = 1; i < 6; i++) {
                System.out.println(namaSiswa + " sedang mengerjakan soal ke-" + i);
                if(i == 5 ) {
                    System.out.println(namaSiswa + " selesai mengerjakan tugas");
                    System.out.println(namaSiswa + " mengumpulkan tugas pada guru");
                }
            }
    }
}
