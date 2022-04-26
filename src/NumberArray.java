import java.util.Scanner;

public class NumberArray {
    String ARRAY_SIZE;

    public NumberArray() {

        System.out.println("Please enter the array size (integers only): ");
        Scanner s = new Scanner(System.in);

        if(s.hasNextInt()) {
            ARRAY_SIZE = s.nextLine();
        }
    }

}
