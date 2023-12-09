import  java.io.*;
import java.util.*;

/*
Клас Lab1KononKI305 реалізовує завдання до лабораторної роботи №1,  варіант 13.
 */
public class lab1KononKI305
{
    /* Статичний метод main є точкою входу в програму*/
    public static void main(String[] args) throws FileNotFoundException {
        /*
         nSize розмір матриці,
         arr матриця.
         */
        int nSize;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("Lab1.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        /*
        Перевірка чи nSize < 4 і парне.
         */
        while (true) {
            System.out.print("\nВведіть розмір квадратної матриці (парне число > 4): ");
            nSize = in.nextInt(); // введення nSize.
            in.nextLine();
            if (nSize % 2 != 0 || nSize < 4) //перевірка.
                System.out.print("\nВВЕДІТЬ ПАРНЕ ЧИСЛО > 4!");
            else
                break;
        }
        arr = new char[nSize][nSize / 2]; // створення масиву.
        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine(); // введення символа заповнювача.
        exit:
        // Перевірка на коректність вводу символа-заповнювача.
        if (filler.length() == 1) {
            /*
            Цикл, в якому виконується вирівнювання матриці при виводі, заповнення її символом-заповнювачем
            та збереження в файл.
             */

            for( int i = 0; i < nSize; i++)
            {
                for(int j = 0; j < nSize / 2; j++)
                {
                    arr[i][j] = (char) filler.codePointAt(0);
                    System.out.print(" " + arr[i][j]);
                    fout.print(" " + arr[i][j]);
                }
                System.out.print("\n");
            }
        }
        else if(filler.isEmpty())
        {
            System.out.print("\nНе введено символ заповнювач");
            break exit;
        }
        else{
            System.out.print("\nЗабагато символів заповнювачів!");
            break exit;
        }
        System.out.println();
        fout.flush();
        fout.close();
    }
}