package HW2;

public class Exception2  extends IndexOutOfBoundsException {
    public Exception2(){
        super("Массив не формата 4х4");
    }

    public Exception2(int x, int y) {
    }
}