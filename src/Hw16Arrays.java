import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
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

        int[] array_A = createRandomIntArray(10, 20, 20);

        System.out.println("\nArithmetic average of the array_A values = "
                + Arrays.stream(array_A).average().getAsDouble());

        /*
        2. Напишите программу, которая находит наибольший элемент в массиве
целых чисел.
         */

        Arrays.sort(array_A);

        System.out.println("\nHighest value of array_A values = " + array_A[array_A.length - 1]);
        System.out.println();

        /*
        3. Поиск повторяющихся элементов: Напишите программу, которая находит
и выводит в консоль все повторяющиеся элементы в заданном массиве
целых чисел. Если нет повторяющихся элементов, программа должна
выводить "Повторяющихся элементов нет". Пример кода для создания
массива
int[] numbers = {1, 2, 3, 2, 4, 5};
         */

        Set<Integer> arreyElementsSet = new HashSet<>();

        for (int i = 0; i < array_A.length; i++) {

            if (!arreyElementsSet.add(array_A[i]))
                System.out.println("Repeated value of array_A[" + i + "] = " + array_A[i]);
        }

        if (arreyElementsSet.size() == array_A.length)
            System.out.println("Array_A doesn't contain repeated elements");

        System.out.println();

        /*
        4. Упражнение на суммирование элементов: Напишите программу, которая
вычисляет сумму всех элементов в заданном массиве целых чисел и
выводит ее на экран
         */

        System.out.println("Array_A elements sum = " + Arrays.stream(array_A).sum());
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
        System.out.println("\n\nNumber of gaps in expression \"All of The Times\" = "
                + str.chars().filter(ch -> ch == ' ').count());

        /*
        7 Напишите программу, которая находит сумму всех элементов в заданном
массиве целых чисел с использованием цикла while.
         */

        int i = 0, sum = 0;

        while (i != array_A.length)
            sum += array_A[i++];

        System.out.println("\nAnother way of count Array_A elements sum = " + sum);

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
        int[] array_B = new int[ARRAY_LENGTH];

        for (int j = 0; j < array_B.length; j++)
            array_B[j] = RandomGenerator.getDefault().nextInt(30);

        /*
        7
Создайте массив целых чисел от 1 до 10 в цикле. Создайте новый массив
в рамках другого цикла, где есть только чётные числа. Подсказка - для
определения четности используем остаток от деления на 2 (num % 2 == 0
). С помощью цикла while выведите содержимое массива с четными
числами на экран
         */

        ArrayList<Integer> listOfEvenNumbers = new ArrayList<>();
        int[] array_C = new int[10];

        for (int j = 0; j < array_C.length; j++) {

            array_C[j] = j + 1;
            if ((j + 1) % 2 == 0) listOfEvenNumbers.add(j + 1);

        }

        Integer[] arrayOfEvenNumbers = new Integer[listOfEvenNumbers.size()];
        listOfEvenNumbers.toArray(arrayOfEvenNumbers);

        System.out.print("\nArray of even numbers: ");
        int b = 0;

        while (b != arrayOfEvenNumbers.length)
            System.out.print(arrayOfEvenNumbers[b++] + " ");

    }

    public static int[] createRandomIntArray(int minLength, int maxLength, int maxValue) {

        int[] randomIntArray = new int[RandomGenerator.getDefault().nextInt(minLength, maxLength)];

        for (int i = 0; i < randomIntArray.length; i++) {

            randomIntArray[i] = RandomGenerator.getDefault().nextInt(maxValue);

        }

        return randomIntArray;
    }
}