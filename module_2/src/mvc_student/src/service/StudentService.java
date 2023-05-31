package service;

import model.Student;
import repository.IStudentRepository;
import repository.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void display() {
        Student[] students = iStudentRepository.findALl();
        for (int i = 0; i < iStudentRepository.getSize(); i++) {
            System.out.printf("Thông tin sinh viên thứ %d:\n", i + 1);
            System.out.println(students[i]);
        }
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập vào điểm: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, score);

        // Add the student tới repository
        iStudentRepository.addStudent(student);
    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào id muốn sửa: ");
        int fixId = Integer.parseInt(scanner.nextLine());
        Student[] students = iStudentRepository.findALl();
        for (int i = 0; i < iStudentRepository.getSize(); i++) {
            if (students[i].getId() == fixId) {
                System.out.print("Nhập vào tên cần sửa: ");
                students[i].setName(scanner.nextLine());
                System.out.print("Nhập vào điểm cần sửa: ");
                students[i].setScore(Double.parseDouble(scanner.nextLine()));
                System.out.println("Đã sửa hoàn tất !");
            }
        }
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào id muốn xóa: ");
        int delId = Integer.parseInt(scanner.nextLine());
        Student[] students = iStudentRepository.findALl();
        for (int i = 0; i < iStudentRepository.getSize(); i++) {
            if (students[i].getId() == delId) {
                for (int j = i; j < iStudentRepository.getSize(); j++) {
                    students[j] = students[j + 1];
                }
                iStudentRepository.deleteStudent();
            }
        }
    }
}
