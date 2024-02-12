package marketplace.pojos;

import java.io.BufferedReader;
import java.io.OutputStream;

public class DBConnection {

    private OutputStream outputStream;

    private BufferedReader reader;

    public DBConnection(OutputStream outputStream, BufferedReader reader) {
        this.outputStream = outputStream;
        this.reader = reader;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public BufferedReader getReader() {
        return reader;
    }
}
