package org.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
public class Review5 {
    public void method() throws IOException {
        ByteArrayOutputStream os = null;
        try {
            os = new ByteArrayOutputStream();
            os.write("Hello, world!".getBytes());
            os.flush();
            os.close();
        } catch (IOException e) {
            os.close();
        }
    }
}
