//https://github.com/kumarianamika11059-sketch/HelloApp/tree/feature/uc4httphttps://github.com/kumarianamika11059-sketch/HelloApp/tree/feature/uc4https://github.com/kumarianamika11059-sketch/HelloApp/tree/feature/uc4s://github.com/kumarianamika11059-sketch/HelloApp/tree/featpublic class Helloapp_arg {
    public class hello {
    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            String names = "";
            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            System.out.println("Hello, " + names + "!");
        }
    }
}