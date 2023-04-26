package org.saveeditor.tools;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SaveReader {
    public static List<String> read(Path filePath, String delimer) throws IOException {
        String content = new String(Files.readAllBytes(filePath));
        return List.of(content.split(delimer));
    }
}
