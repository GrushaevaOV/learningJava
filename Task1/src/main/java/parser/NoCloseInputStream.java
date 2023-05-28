package parser;

import java.io.FilterInputStream;
import java.io.InputStream;

public class NoCloseInputStream extends FilterInputStream {

    public NoCloseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void close() {

    }

}
