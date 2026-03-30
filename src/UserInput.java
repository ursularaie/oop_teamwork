import java.util.Objects;
import java.util.Scanner;

class UserInput {
    // ilmselt parem tõsta main klassi meetodina userInput
    public static boolean userAnswer() {

        Scanner s = new Scanner(System.in);

        System.out.println("Use gravity? [Y/n]");
        String s1 = s.nextLine();
        boolean gravity;
        if (Objects.equals(s1, "n")) {
            System.out.println("You don't want gravity");
            gravity = false;


        } else {
            System.out.println("You use gravity");
            gravity = true;
        }

        s.close();
        return gravity;
    }
}