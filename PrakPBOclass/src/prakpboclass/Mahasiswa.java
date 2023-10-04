/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpboclass;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    public String nama;
    public String npm;
    private double nilaiUas;
    private double nilaiUts;
    
    public void dataMahasiswa(){
        System.out.println("nama : " + nama);
        System.out.println("npm : "+ npm );
        System.out.println("nilai UAS : "+ nilaiUas );
        System.out.println("nilai UTS : "+ nilaiUts );
        System.out.println("nilai akhir : " + nilaiAkhir());
    }
    
    public void insertNilaiUas(double nilai){
        nilaiUas = nilai;
        
    }
    
    public void insertNilaiUts(double nilai){
        nilaiUts = nilai;
    }
    
    public double nilaiAkhir(){
        double hasil = nilaiUas + nilaiUts;
        return hasil/2;
    }
}
