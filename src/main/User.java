public class User {
    private String name;
    private int age;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public int age() {
        return this.age;
    }

    public static void main(String[] args) {
        User tadzio = new User(1, "Tadzio");
        User krzys = new User(3, "Krzyś");
        User milosz = new User(6, "Miłosz");
        User gabi = new User(13, "Gabrysia");
        User antek = new User(17, "Antoś");
        User[] users = new User[]{tadzio, krzys, milosz, gabi, antek};
        int sum = 0;

        for(int i = 0; i < users.length; ++i) {
            User currentUser = users[i];
            sum += currentUser.age();
        }

        double average = (double)(sum / users.length);

        for (int i = 0; i < users.length; ++i) {
            User currentUser = users[i];
            if ((double)currentUser.age() < average) {
                System.out.println(currentUser.name());
            }
        }

    }
}