package com.p.k.referenceapi.dataload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.p.k.referenceapi.entity.Mapping;

import java.io.*;

public class FileLoader {

    DataStore dataStore = new DataStore();

    public void loadMappingFromFile() {
        Gson gson = new GsonBuilder().create();
        BufferedReader reader;
        String filePath = "src/mapping.json";
        Mapping mapping;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                mapping = gson.fromJson(line, Mapping.class);
                dataStore.getMappingMap().put(mapping.getAc(), mapping.getMce());
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
