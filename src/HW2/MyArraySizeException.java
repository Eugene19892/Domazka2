package HW2;

class Exception extends NumberFormatException {
    public Exception(int i, int j){
        super("Не удалось преобразовать элемент массива к числу (" + i + "," + j + ")");
    }

    public Exception() {

    }
}