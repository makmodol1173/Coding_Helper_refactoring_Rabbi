
package metrices;

import IO.ProjectReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Average_LOC {
    public void totalClass(String path){
        try{
    ProjectReader.fileRead(path, 0);
     for(int i=0;i<ProjectReader.filename.size();i++){      
         new LineOfCode().countLines(ProjectReader.filename.get(i));
     
     
     }

    }catch(Exception e){
       e.printStackTrace();
        
        
    }}
}
