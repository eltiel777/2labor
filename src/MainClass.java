public class MainClass {
    public static void main(String[] args) {

        System.out.println("--Задача A--");
        TaskA(new int[][]{{1, 2}, {3, 4}});
        TaskA(new int[][]{{-1, -2}, {-3, -4}});
        TaskA(new int[][]{{0, 0}, {0, 0}, {0, 0}});
        System.out.println();

        System.out.println("--Задача B--");
        TaskB(new int[][]{{0, 1, 0, 2}, {3, 0, 4, 5}});
        TaskB(new int[][]{{1, 3, 6, 8}});
        TaskB(new int[][]{{5, 0, 0, 0, 0, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 0, 3, 1, 9}});
        System.out.println();

        System.out.println("--Задача C--");
        TaskC(new int[][]{{5, 7, 1}, {3, 8, 9}, {1, 6, 2}});
        TaskC(new int[][]{{8, -4, 0}, {-2, 1, 4}, {5, 0, 5}});
        TaskC(new int[][]{{2, 0, 0}, {1, 7, 12}, {100, 32, 1}});
        System.out.println();

        System.out.println("--Задача D--");
        TaskD("рыжий кот любил есть картофель очень");
        TaskD("кот кот кот кот");
        TaskD("мой брат гуляет просто так");

        System.out.println("--Метод добавления элемента в массив--");
        Array arrayTest = new Array(new int[]{1, 2, 3}); //создали тестовый массив
        System.out.println("Исходный массив:");
        arrayTest.printArray();
        arrayTest.addElement(4); //добавляем 4
        System.out.println("Итоговый массив:");
        arrayTest.printArray();
    }

    //Задача A
    private static void TaskA(int[][] matrixData) { // на вход матрица
        Matrix matrix = new Matrix(matrixData); // создаем объект из входной матрицы
        System.out.println("Исходная матрица:");
        matrix.printMatrix(); // выводим исходную матрицу
        matrix.countSum(); // считаем сумму
        matrix.createMatrixOfMultiply(); // изменяем исходную матрицу
        System.out.println("Итоговая матрица:");
        matrix.printMatrix(); // выводим измененную матрицу
    }

    //Задача B
    private static void TaskB(int[][] matrixData) { //на вход матрица
        Matrix matrix = new Matrix(matrixData); //создаем объект из входной матрицы
        System.out.println("Исходная матрица:");
        matrix.printMatrix(); //выводим исходную матрицу
        matrix.moveZeros(); //меняем ее
        System.out.println("Итоговая матрица:");
        matrix.printMatrix(); //выводим измененную матрицу
    }

    //Задача C
    private static void TaskC(int[][] matrixData) { //на вход матрица
        Matrix matrix = new Matrix(matrixData); //создаем объект из входной матрицы
        Array oneMatr = matrix.MatrixtoArray(); //создаем одномерный массив из матрицы
        oneMatr.sort(); //сортируем массив
        System.out.println("Исходная матрица:");
        matrix.printMatrix(); // выводим исходную матрицу
        System.out.println("Итоговый массив:");
        oneMatr.printArray(); // выводим итоговый массив
    }

    //Задача D
    private static void TaskD(String sentence) { //принимает предложение
        String[] words = TextWork.splitSentence(sentence); //массив из слов предложения
        int[] lengths = TextWork.createLengthArray(words); //массив длин слов
        int[] maxMinIndexes = TextWork.findIndex(lengths); //массив из макс и мин индекса слов (сначала макс потом мин)
        int result = TextWork.colvoWords(maxMinIndexes); //считается количество слов
        if (result < 0) { //проверяем исключение
            result = 0;
        }

        // Вывод результата
        System.out.println("Предложение: " + sentence);
        System.out.println("Результат: " + result);
    }
}



