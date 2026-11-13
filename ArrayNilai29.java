import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args){
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++){
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ") ");
            
            if (nilaiAkhir[i] > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.println("\nJumlah Mahasiswa yang Lulus: " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa yang Tidak Lulus: " + jumlahTidakLulus);
        input.close();
    }
}
