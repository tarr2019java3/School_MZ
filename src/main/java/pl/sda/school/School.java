package pl.sda.school;

import java.util.List;

public class School extends Student {
    private String name;
    private String city;


    public School(String name, String city) {
        super ( );
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void add(List<Student> listaStudentow3) {
    }
}
