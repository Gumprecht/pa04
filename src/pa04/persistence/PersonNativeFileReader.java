package pa04.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import pa04.model.Person;

public class PersonNativeFileReader {
    private final File file;

    public PersonNativeFileReader(File file) {
        this.file = file;
    }
    
    public Person read() throws IOException, ClassNotFoundException {
        FileInputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Object object = ois.readObject();
        ois.close();
        is.close();
        return (Person) object;
    }
}