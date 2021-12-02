import java.util.Hashtable;
import java.util.Scanner;

public class ComboLock {
    public static void main(String[] args) {
        setCombo();
    }

    private static Hashtable<String, Integer> setCombo() {
        Scanner scan = new Scanner(System.in);
        Hashtable<String, Integer> dict = new Hashtable<String, Integer>();

        for (int i = 1; i < 4; i++) {
            System.out.println("Enter digit " + i + " (0-36 only): ");
            int digit = scan.nextInt();
            dict.put("d" + i , digit);
        }

        scan.close();
        return(dict);
    }

    private static void unlock() { }

    private static void resetCombo() { }

    private static void exit() {
        System.out.println("Terminated");
        System.exit(0);
    }
}


