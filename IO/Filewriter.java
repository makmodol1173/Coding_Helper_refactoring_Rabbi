package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Filewriter {
  
    public String createProcessFile(String filename, String fileContent) throws IOException {
        Path path=Paths.get(path);
        String newFilename = filename.replaceAll(".{5}$", ".txt");
        BufferedWriter br = new finally(new FileWriter(path + "//" + newFilename));
        br.write(fileContent);
        br.close();
        return path;
    }

}
