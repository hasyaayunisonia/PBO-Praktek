/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengumpulanTugas_Thread;

/**
 *
 * @author Asus
 */

public class MainPengumpulanTugas {
    public static void main(String[] args) {
        ThreadPengumpulanTugas siswa1 = new ThreadPengumpulanTugas("Tommy");
        ThreadPengumpulanTugas siswa2 = new ThreadPengumpulanTugas("Newtie");
        ThreadPengumpulanTugas siswa3 = new ThreadPengumpulanTugas("Minho");
//        menjalankan method start tanpa parameter
        siswa1.start();
        siswa2.start();
        siswa3.start();
        
//        menjalankan method start berparameter
        siswa1.start(Thread.MAX_PRIORITY);
        siswa2.start(Thread.NORM_PRIORITY);
        siswa3.start(Thread.MIN_PRIORITY);
//        siswa1.start(Thread.NORM_PRIORITY);
//        siswa2.start(Thread.NORM_PRIORITY);
//        siswa3.start(Thread.NORM_PRIORITY);
    }
}
