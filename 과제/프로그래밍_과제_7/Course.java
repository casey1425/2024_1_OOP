public class Course {
    private String courseName;
    private int maxStudents;
    private int currentStudents;
    private int credit;
    private static int courseCount = 0;

    public Course(String courseName, int maxStudents, int credit) {
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.credit = credit;
        this.currentStudents = 0;
        courseCount++;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getCurrentStudents() {
        return currentStudents;
    }

    public int getCredit() {
        return credit;
    }

    public static int getCourseCount() {
        return courseCount;
    }

    public String toString() {
        return  courseName +"\t"+ maxStudents +"\t" + currentStudents;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void increaseMaxStudents(int maxStudents) {
        this.maxStudents += maxStudents;
    }

    public void setCurrentStudents(int i) {
    }
}
