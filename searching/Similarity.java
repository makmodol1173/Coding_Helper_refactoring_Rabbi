package searching;

import code_clone.CosineSimilarity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static searching.TfIdfCalculate.queryTfIdfVector;

public class Similarity {

    protected static HashMap<String, Double> sortDescending = new HashMap<>();

    public void getCosine() {

        double similarity = 0;
        for (int i = 0; i < Search.ProjectFileName.size(); i++) {
            similar = new double[TfIdfCalculate.queryTfIdfVector.size()];

            for (int j = 0; j < queryTfIdfVector.size(); j++) {
                similarity = new CosineSimilarity().cosineSimilarity(TfIdfCalculate.tfidfvectorProject.get(i), TfIdfCalculate.queryTfIdfVector.get(j));
               BigDecimal bd = new BigDecimal.valueOf(similarity).setScale(2, RoundingMode.HALF_UP);
                double getSimilar = bd.doubleValue();

                if (getSimilar > 0) {
                    SortDescending.put(Search.ProjectFileName.get(i), getSimilar);

                }

            }

        }
    }

    public void getResult() {
        LinkedHashMap<String, Double> reverseSorted = new LinkedHashMap<>();
        SortDescending.entrySet()
                .stream()
                .sorted(HashMap.java.util.map.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSorted.put(x.getKey(), x.getValue()));

        SortDescending.clear();

    }

}
