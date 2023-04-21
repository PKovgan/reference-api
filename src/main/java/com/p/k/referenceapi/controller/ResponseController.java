package com.p.k.referenceapi.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.p.k.referenceapi.dataload.DataStore;
import com.p.k.referenceapi.dataload.FileLoader;
import com.p.k.referenceapi.entity.Mapping;
import com.p.k.referenceapi.entity.MappingCopyEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
public class ResponseController {

    FileLoader fileLoader = new FileLoader();
    DataStore dataStore = new DataStore();

    @GetMapping(value = "/{id}")
    public ResponseEntity<Mapping> getResponse(@PathVariable("id") String id) {

        fileLoader.loadMappingFromFile();

        Mapping mapping = new Mapping();
        mapping.setAc(id);
        MappingCopyEntity mappingCopyEntity = dataStore.getMappingMap().get(id);
        mapping.setMce(mappingCopyEntity);
//        String filePath = "src/mapping.json";
//        Writer writer = null;

//        if (id.equalsIgnoreCase("111111")) {
//            mapping.setAc(id);
//            mappingCopyEntity = new MappingCopyEntity("ABC", "A");
//            mapping.setMce(mappingCopyEntity);
//        } else if (id.equalsIgnoreCase("222222")) {
//            mapping.setAc(id);
//            mappingCopyEntity = new MappingCopyEntity("BCD", "B");
//            mapping.setMce(mappingCopyEntity);
//        } else {
//            mapping.setAc(id);
//            mappingCopyEntity = new MappingCopyEntity("Incorrect AC", "Incorrect AC");
//            mapping.setMce(mappingCopyEntity);
//        }
//        try {
//            writer = new FileWriter(filePath, true);
//            Gson gson = new GsonBuilder().create();
//            gson.toJson(mapping, writer);
//            writer.write("\r\n");
//            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            mapping = gson.fromJson(new FileReader(filePath), Mapping.class);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        return ResponseEntity.ok(mapping);
    }
}
