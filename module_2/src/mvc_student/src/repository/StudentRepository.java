package repository;

import model.Student;

public class StudentRepository implements IStudentRepository {
    static Student[] students = new Student[100];
    static int size = 0;

    static {
        students[0] = new Student(1, "Nguyễn Văn A", 9.6);
        students[1] = new Student(2, "Nguyễn Văn B", 5.6);
        students[2] = new Student(3, "Nguyễn Văn C", 6.7);
        size = 3;
    }

    @Override
    public Student[] findALl() {
        return students;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
        } else {
            throw new IllegalStateException("Mảng sinh viên đã đầy");
        }
    }
    public void deleteStudent() {
        size--;
    }

}