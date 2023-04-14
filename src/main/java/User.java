public class User {
    private String name;
    private double age;
    private double height;
    public User(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName() {
        return this.name;
    }
    public String description() {
        if (age > 30 && height > 160) {
            return "User is older than 30 and taller than 160cm";
        } else {
            return "User is 30 (or younger) or 160cm (or shorter)";
        }
    }
}
