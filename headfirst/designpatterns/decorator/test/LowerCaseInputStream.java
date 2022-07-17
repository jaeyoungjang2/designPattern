package headfirst.designpatterns.decorator.test;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LowerCaseInputStream extends FileInputStream {
    public LowerCaseInputStream(String name) throws FileNotFoundException {
        super(name);
    }

    public LowerCaseInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    public LowerCaseInputStream(FileDescriptor fdObj) {
        super(fdObj);
    }


    public int read() {
        return 4;
    }
}
