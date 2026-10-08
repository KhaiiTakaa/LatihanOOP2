/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Keenan Herzel
 */
public class Main {
    public static void main(String[] args) {

        Siswa siswa1 = new Siswa();
        siswa1.setNama("Keenan");
        siswa1.setNis("1001");
        siswa1.setUmur(16);
        siswa1.setNilai(90);
        siswa1.setAktif(true);

        Siswa siswa2 = new Siswa();
        siswa2.setNama("Rizky");
        siswa2.setNis("1002");
        siswa2.setUmur(16);
        siswa2.setNilai(85);
        siswa2.setAktif(true);

        System.out.println("=== DATA SISWA 1 ===");
        System.out.println("Nama  : " + siswa1.getNama());
        System.out.println("NIS   : " + siswa1.getNis());
        System.out.println("Umur  : " + siswa1.getUmur());
        System.out.println("Nilai : " + siswa1.getNilai());
        System.out.println("Aktif : " + siswa1.isAktif());

        System.out.println();

        System.out.println("=== DATA SISWA 2 ===");
        System.out.println("Nama  : " + siswa2.getNama());
        System.out.println("NIS   : " + siswa2.getNis());
        System.out.println("Umur  : " + siswa2.getUmur());
        System.out.println("Nilai : " + siswa2.getNilai());
        System.out.println("Aktif : " + siswa2.isAktif());
    }
}