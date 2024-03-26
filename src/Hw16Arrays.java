import java.util.random.RandomGenerator;

public class Hw16Arrays {
    public static void main(String[] args) {

        /*
        1. Напишите программу, которая находит среднее арифметическое
элементов заданного массива целых чисел. В этой задаче вы можете
использовать массив для хранения чисел и цикл для вычисления их
суммы. Затем найдите среднее значение, разделив сумму элементов на
количество элементов массива.
         */

        int[] arrayA = createRandomIntArray(10, 20, 20);

        int x = 0;

        for (int k : arrayA) x += k;

        double avg = (double) x / arrayA.length;

        System.out.println("\nArithmetic average of the arrayA values = "
                + avg);

        /*
        2. Напишите программу, которая находит наибольший элемент в массиве
целых чисел.
         */

        int maxVal = 0;

        for (int k : arrayA) {

            if (maxVal < k) maxVal = k;

        }

        System.out.println("\nHighest value of arrayA values = " + maxVal);
        System.out.println();

        /*
        3. Поиск повторяющихся элементов: Напишите программу, которая находит
и выводит в консоль все повторяющиеся элементы в заданном массиве
целых чисел. Если нет повторяющихся элементов, программа должна
выводить "Повторяющихся элементов нет". Пример кода для создания
массива
int[] numbers = {1, 2, 3, 2, 4, 5};
         */

        int count = 0;

        for (int i = 0; i < arrayA.length; i++) {

            for (int j = i + 1; j < arrayA.length; j++) {

                if (arrayA[i] == arrayA[j]) {

                    System.out.println("arrayA[" + i + "] = arrayA[" + j + "] = " + arrayA[j]);
                    count++;
                }
            }
        }

        if (count == 0)
            System.out.println("\narrayA doesn't contain repeated elements");

        /*
        4. Упражнение на суммирование элементов: Напишите программу, которая
вычисляет сумму всех элементов в заданном массиве целых чисел и
выводит ее на экран
         */

        int sum = 0;

        for (int y : arrayA) sum += y;

        System.out.println("\narrayA elements sum = " + sum);
        System.out.println();

        /*
        5. Вывести числа от 10 до 1 в обратном порядке используя цикл for. Для
уменьшения переменной цикла можно использовать декремент “–-”
         */

        for (int i = 10; i > 0; i--)
            System.out.print(i + " ");

        /*
        6b
Подсчитать количество пробелов в строке “All of The Times”
         */

        String str = "All of The Times";
        int gapsCount = 0;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ') gapsCount++;

        System.out.println("\n\nNumber of gaps in expression \"All of The Times\" = " + gapsCount);

        /*
        7 Напишите программу, которая находит сумму всех элементов в заданном
массиве целых чисел с использованием цикла while.
         */

        int i = 0, arrayASum = 0;

        while (i != arrayA.length)
            arrayASum += arrayA[i++];

        System.out.println("\nAnother way of count arrayA elements sum = " + arrayASum);

        /*
        Повышенная сложность
        6.
Создайте массив целых чисел c использованием цикла и генератора
случайных цисел. Длину массива определите с использованием константы,
которую нужно объявить заранее. С помощью цикла for заполните все
элементы массива случайным целым значением, которое можно
генерировать например с помощью стандартного класса Random (попросит
импортировать его):
Random rd = new Random();
int number = rd.nextInt();
System.out.println( number );
         */

        final int ARRAY_LENGTH = 10;
        int[] arrayB = new int[ARRAY_LENGTH];

        for (int j = 0; j < arrayB.length; j++)
            arrayB[j] = RandomGenerator.getDefault().nextInt(30);

        /*
        7
Создайте массив целых чисел от 1 до 10 в цикле. Создайте новый массив
в рамках другого цикла, где есть только чётные числа. Подсказка - для
определения четности используем остаток от деления на 2 (num % 2 == 0
). С помощью цикла while выведите содержимое массива с четными
числами на экран
         */

        int[] arrayC = new int[10];

        for (int j = 0; j < arrayC.length; j++) {

            arrayC[j] = j + 1;

        }

        int[] arrayOfEvenNumbers = new int[10];
        int f = 0;

        for (int j = 0; j < arrayOfEvenNumbers.length; j++) {
            f++;
            while (f % 2 != 0)
                f++;

            arrayOfEvenNumbers[j] = f;

        }

        System.out.print("\nArray of even numbers: ");
        int b = 0;

        while (b != arrayOfEvenNumbers.length)
            System.out.print(arrayOfEvenNumbers[b++] + " ");
        System.out.println();

    }

    public static int[] createRandomIntArray(int minLength, int maxLength, int maxValue) {

        int[] randomIntArray = new int[RandomGenerator.getDefault().nextInt(minLength, maxLength)];

        for (int i = 0; i < randomIntArray.length; i++) {

            randomIntArray[i] = RandomGenerator.getDefault().nextInt(maxValue);

        }

        return randomIntArray;
    }
}