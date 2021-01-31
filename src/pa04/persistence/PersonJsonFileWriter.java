package pa04.persistence;

import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import pa04.model.Person;

public class PersonJsonFileWriter {
    private final File file;

    public PersonJsonFileWriter(File file) {
        this.file = file;
    }
    
    public void write(Person person) throws IOException {
        FileWriter fw = new FileWriter(file);
        fw.write(new GsonBuilder().create().toJson(person));
        fw.close();
    }
    
}