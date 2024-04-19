public class CourseDriver {
    public static void main(String[] args) {
        Course course1 = new Course("알고리즘", 30, 4);
        Course course2 = new Course("자료 구조", 25, 3);

        System.out.println("수강 신청전");
        System.out.println("교과목명\t최대 학생수\t현재 학생수");
        System.out.println(course1);
        System.out.println(course2);

        course1.setMaxStudents(course1.getMaxStudents() + 6);
        course2.setMaxStudents(course2.getMaxStudents() + 3);

        System.out.println("수강 인원 증원후");
        System.out.println("교과목명\t최대 학생수\t현재 학생수");
        System.out.println(course1);
        System.out.println(course2);

        System.out.println("생성된 교과목들의 수: " + Course.getCourseCount());

        Student student1 = new Student("2101", "선남", 18);
        Student student2 = new Student("2102", "선녀", 21);
        Student student3 = new Student("2103", "길동", 18);

        System.out.println("학번\t이름\t신청 학점수");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        Register register1 = new Register(student1, course1);
        Register register2 = new Register(student2, course1);
        Register register3 = new Register(student2, course2);
        Register register4 = new Register(student3, course1);
        Register register5 = new Register(student3, course2);
        System.out.println(register1);
        System.out.println(register2);
        System.out.println(register3);
        System.out.println(register4);
        System.out.println(register5);

        System.out.println("수강 신청후");
        System.out.println("교과목명\t최대 학생수\t현재 학생수");
        System.out.println(course1);
        System.out.println(course2);

        System.out.println("학번\t이름\t학점수");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}