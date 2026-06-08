package entities;

import exceptions.StudentNotFoundExceptions;
import exceptions.ValidationExceptions;

import java.util.Random;

public class Student {
    private final String name;
    private final String surname;
    private int id;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Random random = new Random();
        this.id = random.nextInt();
    }

    public static Student findById(int studentId) throws StudentNotFoundExceptions {
        //Simuliamo la ricerca tramite id
        Student studentFromDB = new Student("Aldo", "Baglio");

        if (studentFromDB != null) return studentFromDB;
        else throw new StudentNotFoundExceptions(studentId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3) throw new ValidationExceptions(name + " è un nome troppo corto");
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
