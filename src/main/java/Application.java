public class Application {

        public static void main(String[] args) {
            User user = new User("Adam", 40.5, 178);

            if (user.getName() != null) {
                System.out.println(user.description());
            }
        }
    }

