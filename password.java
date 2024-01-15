import java.util.Scanner;

public class password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        int result = isValidPassword(password);

        if (result == 1) {
            System.out.println("1 - Valid password");
        } else {
            System.out.println("0 - Invalid password");
        }
    }

    public static int isValidPassword(String password) {
        // Check the length
        if (password.length() < 8) {
            return 0;
        }

        // Check for at least one uppercase letter
        if (!containsUppercase(password)) {
            return 0;
        }

        // Check for at least one lowercase letter
        if (!containsLowercase(password)) {
            return 0;
        }

        // Check for at least one special character
        if (!containsSpecialCharacter(password)) {
            return 0;
        }

        // Check for at least one digit
        if (!containsDigit(password)) {
            return 0;
        }

        // Check for white space
        if (password.contains(" ")) {
            return 0;
        }

        // If all conditions are met, return 1
        return 1;
    }

    private static boolean containsUppercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsLowercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialCharacter(String password) {
        String specialCharacters = "!@#$%^&*()-_+=<>?/{}[]|";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
