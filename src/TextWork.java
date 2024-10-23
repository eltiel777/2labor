public class TextWork {
    private String text; //поле для хранения текста
    //КОНСТРУКТОРЫ

    //пустой
    public TextWork() {
        this.text = ""; //инициализация пустой строки
    }

    //с аргументом
    public TextWork(String text) { //инициализация с готовым текстом
        this.text = text;
    }

    //клонирующий конструктор
    public TextWork(TextWork copy) {
        this.text = new String(copy.text); //создаем новый объект, и копируем туда содержание текста
    }

    //разбивка строки на слова по пробелу
    public static String[] splitSentence(String sentence) {
        return sentence.split(" ");
    }

    //создание массива длин слов
    public static int[] createLengthArray(String[] words) {
        int[] lengths = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            lengths[i] = words[i].length(); //записываем длину каждого слова
        }
        return lengths;
    }

    //нахождение индексов слов с максимальной и минимальной длиной
    public static int[] findIndex(int[] lengths) {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < lengths.length; i++) {
            if (lengths[i] > lengths[maxIndex]) {
                maxIndex = i; //обновляем индекс максимального слова
            }
            if (lengths[i] < lengths[minIndex]) {
                minIndex = i; //обновляем индекс минимального слова
            }
        }
        return new int[]{maxIndex, minIndex}; //возвращаем массив с индексами
    }

    //подсчет количества слов между самым длинным и самым коротким
    public static int colvoWords(int[] maxMinIndexes) {
        int maxIndex = maxMinIndexes[0];
        int minIndex = maxMinIndexes[1];
        return Math.abs(maxIndex - minIndex) - 1; //считаем количество слов между
    }
}
