package model;

public class Student {
    private  int id; // Biến toàn cục, biến đối tượng
    private String name;
    static  int count;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;

        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if ( score < 0 || score > 10) {
            System.out.println("Điểm không hợp lệ");
            // exception
        } else {
            this.score = score;
        }
    }
    static { // Khối static
        count = 110;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
