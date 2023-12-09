package KI305.Konon.Lab5;
import java.io.IOException;
import java.util.Scanner;

public class FioApp {
    public static void main(String[] args) throws IOException {
        CalcWFio obj = new CalcWFio();
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Введіть X: ");
            double data = s.nextDouble();
            obj.calculate(data);
        }
        System.out.println("Результат обчислення: " + obj.getResult());

        //obj.writeResTxt("textRes.txt");
        obj.writeResBinRandomAccess("BinRes.bin");
        obj.writeResTxtRandomAccess("textRes.txt");

        obj.readResBinRandomAccess("BinRes.bin");
        System.out.println("Результат в бінарному файлі: " + obj.getResult());

        obj.readResTxt("textRes.txt");
        System.out.println("Результат в текстовому файлі: " + obj.getResult());
    }
}
