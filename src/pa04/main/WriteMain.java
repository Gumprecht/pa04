package pa04.main;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import pa04.model.Person;
import pa04.persistence.PersonJsonFileWriter;
import pa04.persistence.PersonNativeFileWriter;

public class WriteMain {

    public static void main(String[] args) throws IOException {
        Person person = 
                new Person("Maria", LocalDate.of(2018, Month.MARCH, 1));
        File file = new File("Maria.person");
        PersonNativeFileWriter pnfw = new PersonNativeFileWriter(file);
        pnfw.write(person);
        System.out.println("Guardada, Person " + person.getName()
                          + " nacida el " + person.getBirthdate());
        
        PersonJsonFileWriter pjfw = 
                new PersonJsonFileWriter(new File("Maria.json"));
        pjfw.write(person);
        System.out.println("Guardada (json), Person " + person.getName()
                          + " nacida el " + person.getBirthdate());        
    }
    
}