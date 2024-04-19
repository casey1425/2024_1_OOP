public class Student {
    private String studentID;
    private String studentName;
    private int maxCredit;
    private int currentCredit;

    public Student(String studentID, String studentName, int maxCredit) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.maxCredit = maxCredit;
        this.currentCredit = 0;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMaxCredit() {
        return maxCredit;
    }

    public int getCurrentCredit() {
        return currentCredit;
    }

    public String toString() {
        return  studentID +"\t"+ studentName +"\t"+ currentCredit;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMaxCredit(int maxCredit) {
        this.maxCredit = maxCredit;
    }

    public void setCurrentCredit(int i) {
    }
}
