public class TipeDataNumber {
    public static void main(String[] args) {
        // Default value = 0

        // Integer Number
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        // Floating Point Number
        float iniFloat = 10.50F;
        double iniDouble = 10.50;

        // Literals Number {hex, bin, desimal}
        int decimal = 34;
        int hexDecimal = 0xFFFFFF;
        int binDecimal = 0b101010;

        // Underscore Nomber (Pemisah untuk memudahkan membaca angka) !opsional
        int amount = 1_000_000_000;

//        Konversi Number
//        Widening Casting (Otomatis) = byte > short > int > long > float > double
        short konShort = iniByte;
        int konInt = iniShort;

//        Narrowing Casting (Manual) = double > float > long > int > char > short > byte
        int konInt2 = (int) iniLong;
//        Ada kemungkinan terjadi Number Overflow
    }
}
