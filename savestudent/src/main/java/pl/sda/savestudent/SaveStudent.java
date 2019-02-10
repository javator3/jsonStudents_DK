package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveStudent {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Tomasz", "Mórawski", 24423));
        students.add(new Student("Damian", "Kolczyński", 32123));
        students.add(new Student("Monika", "Brzykcy", 53234));
        students.add(new Student("Daria", "Kowalska", 7239));
        students.add(new Student("Adam", "Woaźniak", 45332));
        students.add(new Student("Andrzej", "Jagła", 59323));
        students.add(new Student("Piotr", "Derda", 98422));
        students.add(new Student("Filemon", "Zalewski", 43234));
        students.add(new Student("Roman", "Dajewski", 8733));
        students.add(new Student("Zygmunt", "Waza", 33322));
        students.add(new Student("Henryk", "Kowalski", 42453));
        students.add(new Student("Aneta", "Kowalska", 432432));
        students.add(new Student("Joanna", "Sakwińska", 78294));
        students.add(new Student("Barbara", "Plewa", 78323));
        students.add(new Student("Justyna", "Sarnowska", 43342));


        ObjectMapper mapper = new ObjectMapper();
        String path = "students.json";
        File file = new File(path);
        try {
            mapper.writeValue(file, students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
