public class Variabel {
    public static void main(String[] args) {
        // Tipe variabel pada java hanya menyimpan satu jenis tipe saja

        String name;
        name = "Muhamad Azis";
        int age = 19;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "Isna Fauzyah";
        System.out.println(name);

        // Penggunaan var dapat dilakukan dengan langsung memasukan valuenya
        var company = "mafes";
        var panjang = 234;

        // Penggunaan final dilakukan untuk membuat value tidak dapat berubah
        final String application = "Belajar Java";
//        application = "Belajar Kotlin"; {EROR}
    }
}
