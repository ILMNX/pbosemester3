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
public class PboTeori {
   
        public double saldo;
        public double bunga = 0.01;
        public String nama;
        
        public void tampilkanData(){
            System.out.println("Nasabah : " + nama );
            System.out.println("Bunga   : " + bunga );
            System.out.println("Saldo   : " + saldo );

        }
    
    
}
