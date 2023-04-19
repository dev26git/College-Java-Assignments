package PIJL_Assignments.Assignment_6.PIJL6_Part2;

public class Result extends Student implements Exam{
    public Result(long prn, String name, float mark1, float mark2) {
        super(prn, name, mark1, mark2);
    }
    @Override
    public float percentCal() {
        return (getMark1() + getMark2())  / 2;
    }
}