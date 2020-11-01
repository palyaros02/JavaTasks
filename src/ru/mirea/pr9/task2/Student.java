package ru.mirea.pr9.task2;

import java.util.Random;

class Student implements Comparable <Student>, LabClassUI {

    private Integer id;
    private Integer GPA;
    private String name;

    public Student(String name, Integer GPA) {
        this.GPA = GPA;
        this.name = name;
        Random random = new Random();
        this.id = random.nextInt(10);
    }

    public Student(Integer id, Integer GPA, String name) {
        this.id = id;
        this.GPA = GPA;
        this.name = name;
    }
    public Student() {
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getGPA() {
        return GPA;
    }
    public void setGPA(Integer GPA) {
        this.GPA = GPA;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

/*
    public static Student[] getSamples(boolean flag)
    {
        Random random = new Random();
        var students = new Student[10];

        if (flag == true) {

            for (int i = 0; i < 10; i++) {
                Student student = new Student();
                student.setId(random.nextInt(10) + i);
                students[i] = student;
            }
        } else {
            for (int i = 0; i < 10; i++) {
                Student student = new Student();
                student.setGPA(random.nextInt(5) + 1);
                students[i] = student;
            }
        }

        return students;
    }
*/

    public static void findName(Student[] array, String name) {
        Boolean flag = false;
        for (Student student : array) {
            if (student.getName().equals(name)) {
                System.out.println("Студент " + name + " найден. \nID: " + student.id + "\nСр. балл = " + student.name+"\n");
                flag = true;
            }
        }
        try {
            if (!flag) {
                throw new StudentNotFoundException(name + " не найден(а)");
            }
        } catch(StudentNotFoundException e){
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", GPA=" + GPA +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.GPA - this.GPA;
    }

}

