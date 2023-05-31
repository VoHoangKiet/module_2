package repository;


import model.Student;

public interface IStudentRepository {
    Student[] findALl();

    public int getSize();

    void addStudent(Student student);

    void deleteStudent();
}
