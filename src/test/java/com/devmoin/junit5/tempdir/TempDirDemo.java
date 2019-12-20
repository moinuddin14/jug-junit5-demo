package com.devmoin.junit5.tempdir;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by moin
 * on December, 2019
 **/
public class TempDirDemo {
    @Test
    void writeItemsToFile(@TempDir Path tempDir) throws IOException {
        Path file = tempDir.resolve("test.txt");

//        new ListWriter(file).write("a", "b", "c");

        Files.write(file, singletonList(String.join(",", "a", "b", "c")));
        assertEquals(singletonList("a,b,c"), Files.readAllLines(file));
    }
}
