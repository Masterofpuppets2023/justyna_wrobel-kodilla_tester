public class LeapYear {
    public static void main(String[] args) {
        if (isLeapYear(1988)) {
            System.out.println("isLeapYear");
        } else {
            System.out.println("isNotLeapYear");
        }
    }

    public static boolean isLeapYear(int year) {

        boolean p4 = (year % 4 == 0);
        boolean p100 = (year % 100 == 0);
        boolean p400 = (year % 400 == 0);

        return (p400 || (p4 && !p100));
    }
}


