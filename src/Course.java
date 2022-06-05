public class Course {
    private String title;
    private String regNum;
    private String instructor;
    private float units;
    private String section;
    private int capacity;

    public Course(String title, String regNum, String instructor, float units, String section, int capacity) {
        this.title = title;
        this.regNum = regNum;
        this.instructor = instructor;
        this.units = units;
        this.section = section;
        this.capacity = capacity;
    }

    public Course() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public float getUnits() {
        return units;
    }

    public void setUnits(float units) {
        this.units = units;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
