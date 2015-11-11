package debakesh.com.twentynine.helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import debakesh.com.twentynine.entity.TwentyNineMLFeature;

/**
 * Created by debarghy on 10/6/2015.
 */
public class FeatureWriter {
    BufferedWriter out;
    public FeatureWriter() {
        try{
            File file = new File("feature_29.csv");
            System.out.print(file.getAbsolutePath());
            FileWriter fw = new FileWriter(file.getAbsoluteFile());

            out = new BufferedWriter(fw);
            out.write(new TwentyNineMLFeature().featureNameString() + "\n");

        }catch (Exception e) {

        }

    }
    public void write(TwentyNineMLFeature feature) {
        try{
                out.write(feature.toString()+"\n");
            }catch (Exception e) {

        }

    }

    public void write(List<TwentyNineMLFeature> featureList) {
        try{
        for(TwentyNineMLFeature feature : featureList) {
            out.write(feature.toString());
        }}catch (Exception e) {

        }

    }
        public void close() {
            try{
                out.close();
            }catch (Exception e) {

            }
        }
}
