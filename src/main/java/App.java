/*
1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3 В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета.

 */
public class App {



    public static void main(String[] args) {
        App app = new App();

        try {

            String[][] arr = app.array(new String[][]  {
                    {"1", "1", "1","1"},
                    {"1", "1", "1","1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "2"},


            });
            arrayPrint(arr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }


    public String[][] array(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) { //
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return arr;
    }


    public static void arrayPrint(String[][] arr) {
        for (String[] row : arr) {
            for (String elem : row) {
                System.out.printf("%s ", elem);
            }
            System.out.println();
        }
    }


}