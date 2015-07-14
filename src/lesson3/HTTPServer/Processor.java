package lesson3.HTTPServer;

import java.util.List;

public interface Processor {
    byte[] process(byte[] data, List<String> headers);
}