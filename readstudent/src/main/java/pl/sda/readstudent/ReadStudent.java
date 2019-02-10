package pl.sda.readstudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ReadStudent {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String path = "students.json";
        File file = new File(path);
        Student[] students;
        try {
            students =  objectMapper.readValue(file,Student[].class);
            System.out.println("Wszyscy studenci :");
            Arrays.stream(students).forEach(System.out::println);
            System.out.println("Wszyscy studenci  na literę \"A\":");
            Arrays.stream(students)
                    .filter(student -> student.getName().startsWith("A"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
