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
public class Praktikum7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mahasiswa D = new mahasiswa();
        
        D.printData("Ilmu Komputer");
        System.out.println(D.sumValue());
        
        D.hitungNA();
        D.hitungNA("afa");
        D.hitungNA(1, 2, 3);
    }
    
}
