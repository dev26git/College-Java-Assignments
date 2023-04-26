package PIJL_Assignments.Assignment_8.Part2;

public class NoMatchException extends Exception{
    private String str;
    public NoMatchException(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "NoMatchException: " + str + " does not match 'India'.";
    }
}