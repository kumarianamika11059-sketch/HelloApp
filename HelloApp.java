//https://github.com/kumarianamika11059-sketch/HelloApp/tree/feature/uc4httphttps://github.com/kumarianamika11059-sketch/HelloApp/tree/feature/uc4https://github.com/kumarianamika11059-sketch/HelloApp/tree/feature/uc4s://github.com/kumarianamika11059-sketch/HelloApp/tree/featpublic class Helloapp_arg {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();

            boolean first = true;

            for (String name : args) {
                if (!first) {
                    names.append(", ");
                }
                names.append(name);
                first = false;
            }

            System.out.println("Hello, " + names + "!");
        }
    }


