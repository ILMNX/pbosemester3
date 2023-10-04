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
public class PrakPBOclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa kelasD =  new Mahasiswa();
        
        kelasD.nama =  "Gilbert";
        kelasD.npm = "2217051118";
        
//        System.out.println("nama :" + kelasD.nama);
//        System.out.println("npm :" + kelasD.npm);
        
        kelasD.insertNilaiUas (90);
        kelasD.insertNilaiUts(85);
        
        kelasD.dataMahasiswa();
     
    }
    
}
