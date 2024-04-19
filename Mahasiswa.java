import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mahasiswa {
    private static final double Mahasiswa = 0;
    private Map<String, Double> nilaiMahasiswa;{
        nilaiMahasiswa = new HashMap<>();
    }

    public void tambahMahasiswa(String nim, String kelas, String nama) {
        String key = nim + "-" + kelas + "-" + nama;
        nilaiMahasiswa.put(key, 0.0);
        System.out.println();
        
    }
    public void hapusMahasiswa(String nim, String kelas, String nama) {
        String key = nim + "-" + kelas + "-" + nama;
        if (nilaiMahasiswa.containsKey(key)) {
            nilaiMahasiswa.remove(key);
            System.out.println("Mahasiswa berhasil dihapus!");
        } else {
            System.out.println("Mahasiswa tidak ditemukan!");
        }
    }

    public void simpanNilaiMahasiswa(String nim, String kelas, String nama, double nilai) {
        String key = nim + "-" + kelas + "-" + nama;
        if (nilaiMahasiswa.containsKey(key)) {
            nilaiMahasiswa.put(key, nilai);
            System.out.println();
        } else {
            System.out.println("Mahasiswa tidak ditemukan!");
        }
    }

    public void tampilkanNilaiMahasiswa() {
        System.out.println();
        if (nilaiMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa yang disimpan.");
        } else {
            double totalNilai = 0.0;
            int jumlahMahasiswa = 0;
            for (Map.Entry<String, Double> entry : nilaiMahasiswa.entrySet()) {
                String[] dataMahasiswa = entry.getKey().split("-");
                String nim = dataMahasiswa[0];
                String kelas = dataMahasiswa[1];
                String nama = dataMahasiswa[2];
                double nilai = entry.getValue();
                
                System.out.println("NIM   : " + nim);
                System.out.println("Kelas : " + kelas);
                System.out.println("Nama  : " + nama);
                System.out.println("Nilai : " + nilai);



                totalNilai += nilai;
                jumlahMahasiswa++;
            }

            double rataRata = totalNilai / jumlahMahasiswa;
            System.out.println("Rata-rata nilai mahasiswa: " + rataRata);
        }
    }
}
    
