
public class MyArraySizeException extends Exception {
    private static final int LINE = 4;
    private static final int COLUMN = 4;
    private static final String MSG_TEMPLATE = "Массив должен быть размером: %d строк и %d столбцов";


    public MyArraySizeException() {
        super(String.format(MSG_TEMPLATE, LINE, COLUMN));

    }
}