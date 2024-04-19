public class Register {
    private Student student;
    private Course course;

    public Register(Student student, Course course) {
        this.student = student;
        this.course = course;
        if (course.getCurrentStudents() < course.getMaxStudents()) {
            course.setCurrentStudents(course.getCurrentStudents() + 1);
        } else {
            System.out.println("정원이 차서 수강 신청할 수 없다.");
        }
        if (student.getCurrentCredit() + course.getCredit() <= student.getMaxCredit()) {
            student.setCurrentCredit(student.getCurrentCredit() + course.getCredit());
        } else {
            System.out.println("학점 초과로 수강 신청할 수 없다.");
        }
    }

    public String toString() {
        return student.getStudentName() + ": " + course.getCourseName() + " 수강 신청";
    }
}