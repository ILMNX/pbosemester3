/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

/**
 *
 * @author Praktikan
 */
public class mahasiswa {
    private final String nama = "Gibe";
    private final String npm = "2217";
    private double nilaiTugas;
    private double nilaiUas;
    private double nilaiUts;
    private double NA;
    
    
    public void printData(String jurusan){
        System.out.println("Nama\t:" + this.nama);
        System.out.println("NPM\t:" + this.npm);
        System.out.println("Jurusan\t:" + jurusan);

    }
    
    public int sumValue(){
        return 1+1;
        
    }
    
    public void hitungNA(){
        this.NA = (this .nilaiTugas*0.3) + (this.nilaiUts *0.35) + (this.nilaiUas*0.35);
        System.out.println(this.NA);
    }
    
    public void hitungNA(double a, double b, double c){
        this.NA = (a*0.3) + (b*0.35) + (c*0.35);
        System.out.println(this.NA);
    }
    public void hitungNA(String a){
        System.out.println("Error!");
    }
}
