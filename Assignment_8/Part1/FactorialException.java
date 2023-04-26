package PIJL_Assignments.Assignment_8.Part1;

public class FactorialException extends Exception {
    private int num;

    public FactorialException(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "FactorialException:" + num + " is out of range (0-15)";
    }
}
