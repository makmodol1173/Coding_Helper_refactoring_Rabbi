package metrices;

import IO.ProjectReader;

public class FileCount {

    public int classCount(String path) {
        int totalClass=0;

        try {
            ProjectReader.fileRead(path, 0);
            totalClass = ProjectReader.classCount;
            ProjectReader.classCount = 0;
        }
        return totalClass;
    }
}
