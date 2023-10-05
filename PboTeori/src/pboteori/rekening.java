/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboteori;

/**
 *
 * @author ASUS
 */
public class rekening {
    
    public static void main(String[] args) {
        PboTeori nas1 = new PboTeori();
        nas1.nama = "Gibe";
        nas1.bunga = 0.1;
        nas1.saldo = 1331498;
        
        PboTeori rb0002 = new PboTeori();
        rb0002.nama = "Gebo";
        rb0002.bunga = 0.05;
        rb0002.saldo = 5123140;
        
        nas1.tampilkanData();
        System.out.println("\n");
        rb0002.tampilkanData();
        
    }
}
