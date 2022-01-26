import java.util.ArrayList;
import java.util.Scanner;

public class ArrListLat {
    private static void PrintDaftar(ArrayList<String> daftar) {
        for (int index = 0; index < daftar.size(); index++) {
            System.out.println("Daftar nama ke " + index + " adalah " + daftar.get(index));
        }
    }

    private static ArrayList<String> DaftarNamaInput() {
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.ensureCapacity(5);
        Scanner inputDaftar = new Scanner(System.in);
        for (int y = 0; y < 5; y++) {
            System.out.println("Masukkan Nama = ");
            String nama;
            nama = inputDaftar.nextLine();
            daftarNama.add(nama);
        }
        return daftarNama;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList dengan 5 records");
        ArrayList<String> daftar = new ArrayList<>();
        daftar = DaftarNamaInput();
        PrintDaftar(daftar);
    }

}
