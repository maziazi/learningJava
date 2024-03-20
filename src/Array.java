public class Array {
    public static void main(String[] args) {
        String [] stringArray;
        stringArray = new String [3];
        stringArray[0] = "Muhammad";
        stringArray[1] = "Zafran";
        stringArray[2] = "Hanif";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[1] = "Azis";
        System.out.println(stringArray[1]);

        // Inisalisasi Array
        int [] arrayInt = new int[] {
                10, 20, 30, 40, 50
        };

        int [] arrayAge = {
                2, 4, 6, 8, 10
        };

        System.out.println(arrayAge[3]);
        System.out.println(arrayInt[1]);

        // Operasi Array
        System.out.println(arrayInt.length);
        arrayInt[0]=0;
        System.out.println(arrayInt.length);
        System.out.println(arrayInt[0]);

        // Array di dalam array
        String [][] anggota  = {
                {"Muhammad", "Zafran", "Hanif"},
                {"Muhamad", "Azis"},
                {"Muhammad", "Syaifulloh", "Maibara"}
        };
//        System.out.println(anggota[0]);
        System.out.println(anggota[0][2]);
        System.out.println(anggota[1][1]);
        System.out.println(anggota[2][1]);
    }
}
