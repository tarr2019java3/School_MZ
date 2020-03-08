package pl.sda.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Student student6 = new Student ("Pawel", "Slup");
        Student student7 = new Student ("Bartek", "Nowak");
        Student student8 = new Student ("Monika", "Gala");
        Student student9 = new Student ("Pawel", "Slup");
        Student student10 = new Student ("Bartek", "Nowak");
        Student student11 = new Student ("Monika", "Gala");


        List<Student> listaStudentow = new ArrayList<> ( );
        listaStudentow.add (student1);
        listaStudentow.add (student2);

        List<Student> listaStudentow1 = new ArrayList<> ( );
        listaStudentow1.add (student3);
        listaStudentow1.add (student4);
        listaStudentow1.add (student5);

        List<Student> listaStudentow2 = new ArrayList<> ( );
        listaStudentow2.add (student6);
        listaStudentow2.add (student7);
        listaStudentow2.add (student8);

        List<Student> listaStudentow3 = new ArrayList<> ( );
        listaStudentow3.add (student9);
        listaStudentow3.add (student10);
        listaStudentow3.add (student11);

        Map<School, List<Student>> map = new HashMap<School, List<Student>> ( );
        map.put (school1, listaStudentow);
        map.put (school2, listaStudentow1);
        map.put (school3, listaStudentow2);
        map.put (school4, listaStudentow3);

        for (Map.Entry<School, List<Student>> entry : map.entrySet ( )) {
            System.out.println (entry.getKey ( ).getName ( ));
            for (Student it : entry.getValue ()) {
                System.out.println (String.format (" ", " ") + it.getName ( ) + " " + it.getLastname ( ));
            }
        }
    }
}
