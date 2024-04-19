import java.util.Scanner;

public class Main{ 
    public static void main(String[] args) {
        Mahasiswa dataMahasiswa = new Mahasiswa();
        Scanner input = new Scanner(System.in);

    while (true) {
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa");
        System.out.println("3. Simpan Nilai Mahasiswa");
        System.out.println("4. Tampilkan Nilai Mahasiswa");
        System.out.println("5. Keluar");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan NIM: ");
                String nim = input.next();
                System.out.print("Masukkan kelas: ");
                String kelas = input.next();
                System.out.print("Masukkan nama mahasiswa: ");
                String nama = input.next();
                dataMahasiswa.tambahMahasiswa(nim, kelas, nama);
                break;
            case 2:
                System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                nim = input.next();
                System.out.print("Masukkan kelas mahasiswa yang akan dihapus: ");
                kelas = input.next();
                System.out.print("Masukkan nama mahasiswa yang akan dihapus: ");
                nama = input.next();
                dataMahasiswa.hapusMahasiswa(nim, kelas, nama);
                break;
            case 3:
                System.out.print("Masukkan NIM mahasiswa: ");
                nim = input.next();
                System.out.print("Masukkan kelas mahasiswa: ");
                kelas = input.next();
                System.out.print("Masukkan nama mahasiswa: ");
                nama = input.next();
                System.out.print("Masukkan nilai mahasiswa: ");
                double nilai = input.nextDouble();
                dataMahasiswa.simpanNilaiMahasiswa(nim, kelas, nama, nilai);
                break;
            case 4:
                dataMahasiswa.tampilkanNilaiMahasiswa();
                break;
            case 5:
                break;
        }   
    }}
}