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

    public boolean enroll() {
        if (this.capacity > 0) {
            this.capacity--;
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return this.capacity <= 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + capacity;
        result = prime * result + ((instructor == null) ? 0 : instructor.hashCode());
        result = prime * result + regNum;
        result = prime * result + ((section == null) ? 0 : section.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        long temp;
        temp = Double.doubleToLongBits(units);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (capacity != other.capacity)
            return false;
        if (instructor == null) {
            if (other.instructor != null)
                return false;
        } else if (!instructor.equals(other.instructor))
            return false;
        if (regNum != other.regNum)
            return false;
        if (section == null) {
            if (other.section != null)
                return false;
        } else if (!section.equals(other.section))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (Double.doubleToLongBits(units) != Double.doubleToLongBits(other.units))
            return false;
        return true;
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
