public class SimpleArray {
    public static void main(String[] args) {

        String[] maleNames = new String[5];
        maleNames[0] = "Mateusz";
        maleNames[1] = "Miłosz";
        maleNames[2] = "Krzysztof";
        maleNames[3] = "Tadeusz";
        maleNames[4 ] = "Piotr";

        String maleName = maleNames[3];

        System.out.println(maleName);

        int numberOfElements = maleNames.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }

}

