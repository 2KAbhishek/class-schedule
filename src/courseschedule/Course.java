package courseschedule;
public class Course {
    public static final String TITLE_CONST = "TBD";
    public static final int REGNO_CONST = 0;
    public static final String SECTION_CONST = "0A";
    public static final double UNITS_CONST = 4;
    public static final int CAPACITY_CONST = 30;
    public static final String INSTRUCTOR_CONST = "Staff";

    private String title;
    private int regNum;
    private String section;
    private double units;
    private int capacity;
    private String instructor;

    public Course() {
        this.title = TITLE_CONST;
        this.regNum = REGNO_CONST;
        this.section = SECTION_CONST;
        this.units = UNITS_CONST;
        this.capacity = CAPACITY_CONST;
        this.instructor = INSTRUCTOR_CONST;
    }

    public Course(String title, int regNum, String section, double units, int capacity, String instructor) {
        this.title = title;
        this.regNum = regNum;
        this.section = section;
        this.units = units;
        this.capacity = capacity;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
