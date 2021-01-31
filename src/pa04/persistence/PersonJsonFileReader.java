package pa04.persistence;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import pa04.model.Person;

public class PersonJsonFileReader {
    private final File file;

    public PersonJsonFileReader(File file) {
        this.file = file;
    }
    
    public Person read() throws IOException {
        BufferedReader reader = 
                new BufferedReader(new FileReader(file));
        Person person = new Gson().fromJson(reader.readLine(), Person.class);
        reader.close();
        return person;
    }
}