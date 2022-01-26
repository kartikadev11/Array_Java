public class ArrayTemanku {
    public static void main(String[] args) {
        String[] temanku;
        temanku = new String[4];

        // masukkan ke masing-masing index nama teman

        temanku = new String[]{"wati", "budi", "agus", "noval"};
        // atau bisa juga
        // temanku [0] = "wati";
        // temanku [1] = "budi";
        // temanku [2] = "agus";
        // temanku [3] = "noval";


        // mengeluarkan value index ke 3,2,1 ditampung ke variable nama
        String nama;
        nama = temanku[3];
        nama = temanku[2];
        nama = temanku[1];

        System.out.println(nama);
        // yang muncul adalah index yang terakhir dipanggil yaitu budi --> nama = temanku[1];

    }
}
