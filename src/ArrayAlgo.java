public class ArrayAlgo {
    public static class Mahasiswa{
        private String nim;
        private String nama;
        private String kelas;
        private String prodi;
        private String tglLahir;
        private float ipk;

        public Mahasiswa(){
        }
        public Mahasiswa(String mynim, String mynama, String mykelas,String myprodi, String mydate, int myIPK) { //konstraktor
            this.nim = mynim ;
            this.nama = mynama;
            this.kelas = mykelas ;
            this.prodi = myprodi;
            this.tglLahir = mydate;
            this.ipk = myIPK;
        }


    }

}
