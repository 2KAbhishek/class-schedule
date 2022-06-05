package courseschedule;

import java.util.Scanner;

public class App {
    private static final int NUM_COURSES = 12;
    public static void main(String[] args) {
        Course[] courseList = new Course[NUM_COURSES];
        buildScheduleOfClasses(courseList);
        viewScheduleOfClasses(courseList);
        viewCourseSections(courseList);
        enrollACourse(courseList);
    }

    private static void enrollACourse(Course[] courseList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the course number: ");
        int courseNum = scanner.nextInt();
        for (Course course : courseList) {
            if (course.getRegNum() == courseNum) {
                if (course.enroll()) {
                    System.out.println("Enrolled in course " + courseNum);
                } else {
                    System.out.println("Course " + courseNum + " is full");
                }
            }
        }
    }

    private static void viewCourseSections(Course[] courseList) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean found = false;
            System.out.print("Enter course title: ");
            String title = scanner.nextLine();
            for (Course course : courseList) {
                if (course.getTitle().equals(title)) {
                    found = true;
                    if (course.isFull())
                        System.out.println("Course is full");
                    System.out.println("Course sections: " + course.getSection());
                }
            }
            if (!found)
                System.out.println("Sorry, Course not found");
        }
    }

    private static void viewScheduleOfClasses(Course[] courseList) {
        for (int i = 0; i < courseList.length; i++) {
            System.out.println(courseList[i]);
        }
    }

    public static void buildScheduleOfClasses(Course[] courseList) {
        String[] titles = {"CS101", "CS102", "CS103", "CS104", "CS105", "CS106", "CS107", "CS108", "CS109", "CS110", "CS111", "CS112"};
        int[] regNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] sections = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        double[] units = {4, 4.5, 5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5};
        int[] capacities = {30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140};
        String[]  instructors = {"Staff1", "Staff2", "Staff3", "Staff4", "Staff5", "Staff6", "Staff7", "Staff8", "Staff9", "Staff10", "Staff11", "Staff12"};

        for (int i = 0; i < courseList.length; ++i) {
            if (i %2 == 0) {
                courseList[i] = new Course();
                courseList[i].setTitle(titles[i]);
                courseList[i].setRegNum(regNums[i]);
                courseList[i].setSection(sections[i]);
                courseList[i].setUnits(units[i]);
                courseList[i].setCapacity(capacities[i]);
                courseList[i].setInstructor(instructors[i]);
            } else {
                courseList[i] = new Course(titles[i], regNums[i], sections[i], units[i], capacities[i], instructors[i]);
            }
        }
    }
}
