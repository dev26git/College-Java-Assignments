package PIJL_Assignments.Assignment_8.Part1;

public class myNumberFormatException extends Exception{
    private String s;

    public myNumberFormatException(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "myNumberFormatException:" + s + " is not an integer.";
    }
}
