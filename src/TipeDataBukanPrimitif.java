public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
//        Primitif >< Bukan Primitif {
//            byte >< Byte
//            short >< Short
//            int >< Integer
//            long >< Long
//            float >< Float
//            double >< Double
//            char >< Character
//            boolean >< Boolean
//        } Default primitif 0, Default bukan primitif Null
        Integer iniInt = 100;
        Long iniLong = 10000L;

        Byte iniByte=null;
        System.out.println(iniByte);

        iniByte=100;
        System.out.println(iniByte);

        // Konversi dari primtif ke bukan premitif
        int age = 30;
        Integer ageObject = age;

        // Konversi dari bukan primitif ke premitif
        short iniShort = ageObject.shortValue();
        long iniLong2 = ageObject.longValue();
    }
}
