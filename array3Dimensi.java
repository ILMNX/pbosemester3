package pbo;

public class array3Dimensi {
    public static void main(String[] args) {
        
        //  [tebal] [baris] [kolom]

        String[][][] dataMahasiswa = new String[3][10][1];
        
        dataMahasiswa[0][0][0] = "Wayan Santie Arif";
        dataMahasiswa[0][1][0] = "Rio Arisandi";
        dataMahasiswa[0][2][0] = "Dafa Farhan Haqiqi";
        dataMahasiswa[0][3][0] = "Jefri Raihan Akbar";
        dataMahasiswa[0][4][0] = "Gilbert Hasiholan";
        dataMahasiswa[0][5][0] = "M. Reza kurniawan";
        dataMahasiswa[0][6][0] = "M. Rifqi al ardabili";
        dataMahasiswa[0][7][0] = "Jhon V Nababan";
        dataMahasiswa[0][8][0] = "Enggal Bima Sakti";
        dataMahasiswa[0][9][0] = "Rofif Ramadhan Khoirulloh Sowija";
        
        dataMahasiswa[1][0][0] = "2257051031";
        dataMahasiswa[1][1][0] = "2217051154";
        dataMahasiswa[1][2][0] = "2267051001";
        dataMahasiswa[1][3][0] = "2217051133";
        dataMahasiswa[1][4][0] = "2217051118";
        dataMahasiswa[1][5][0] = "2257051017";
        dataMahasiswa[1][6][0] = "2217051128";
        dataMahasiswa[1][7][0] = "2217051087";
        dataMahasiswa[1][8][0] = "2217051032";
        dataMahasiswa[1][9][0] = "2257051009";
        
        dataMahasiswa[2][0][0] = "D";
        dataMahasiswa[2][1][0] = "D";
        dataMahasiswa[2][2][0] = "D";
        dataMahasiswa[2][3][0] = "D";
        dataMahasiswa[2][4][0] = "D";
        dataMahasiswa[2][5][0] = "D";
        dataMahasiswa[2][6][0] = "D";
        dataMahasiswa[2][7][0] = "D";
        dataMahasiswa[2][8][0] = "D";
        dataMahasiswa[2][9][0] = "D";
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Nama  : " + dataMahasiswa[0][i][0]);
            System.out.println("NPM   : " + dataMahasiswa[1][i][0]);
            System.out.println("Kelas : " + dataMahasiswa[2][i][0]);
            System.out.println();
        }
    }
}
