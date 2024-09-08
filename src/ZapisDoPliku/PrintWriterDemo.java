package ZapisDoPliku;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo  {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("danie.txt");

        pw.println("Adrian nie lubi cokolwiek ");

        //zapisanie kolejnej linii
        //pw.println("Szymon lubi jeść ( kebaba z truskawkami)");

        pw.close();
    }
}
