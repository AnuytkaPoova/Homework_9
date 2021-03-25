

public class MyArrayDataException extends Exception{

    private static final String MSG_TEMPLATE2 = "В массив введены недопустимые символы! В строке %d и столбце %d ";

    MyArrayDataException(int i, int j) {
        super(String.format(MSG_TEMPLATE2, i + 1, j + 1));


    }
}
