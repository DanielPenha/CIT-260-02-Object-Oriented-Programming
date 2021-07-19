import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestIO {
    public static void main(String[] args) throws IOException {
        // Write the data to the file
        try  (PrintWriter data = new PrintWriter("data.txt") ) {
            for(int i = 0; i < 10; i++) {
                data.format("%d%n",  i+1);
            }
        }

        System.out.println("output complete.");

        // read file back in and output the numbers

        System.out.println("Contents of the file");

        File myFile = new File("data.txt");

        try(Scanner input = new Scanner(myFile) ) {

            while(input.hasNextLine() ) {

                String line = input.nextLine().trim();

                int value = Integer.parseInt(line);

                System.out.println(value);

            }

        }

    }

}
