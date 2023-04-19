package PIJL_Assignments.Assignment_6.PIJL6_Part2;

public class Student {
	private long prn;
	private String name;
	private float mark1, mark2;

    public Student() {}

    // Parameterized constructor
    public Student(long prn, String name, float mark1, float mark2) {
        this.prn = prn;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }


    /* Getters and Setters Start */
    public long getPrn() {
        return prn;
    }

    public void setPrn(long prn) {
        this.prn = prn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public float getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }
    /* Getters and Setters End */


    public void display() {
        System.out.println("Student(" + this.prn + ", " + this.name + ", " + this.mark1 + ", " + this.mark2 + ")");
    }

    @Override
    public String toString() {
        return "Student{" +
                "prn=" + prn +
                ", name='" + name + '\'' +
                ", mark1=" + mark1 +
                ", mark2=" + mark2 +
                '}';
    }
}