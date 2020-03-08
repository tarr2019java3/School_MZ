package pl.sda.school;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	School school1 = new School ("Ekonomik", "Włocławek");
        School school2 = new School ("Ogolniak", "Włocławek");
        School school3 = new School ("Elektryk", "Toruń");
        School school4 = new School ("Samochodowka", "Gdansk");

        Student student1 = new Student ("Anna", "Kowalska");
        Student student2 = new Student ("Gosia", "Kowalska");
        Student student3 = new Student ("Pawel", "Slup");
        Student student4 = new Student ("Bartek", "Nowak");
        Student student5 = new Student ("Monika", "Gala");

        List<Student> listaStudentow = new ArrayList<> ();
        listaStudentow.add( student1);
        listaStudentow.add( student2);
        listaStudentow.add( student3);
        listaStudentow.add( student4);
        listaStudentow.add( student5);




    }
}
