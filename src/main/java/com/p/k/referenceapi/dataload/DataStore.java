package com.p.k.referenceapi.dataload;

import com.p.k.referenceapi.entity.MappingCopyEntity;

import java.util.HashMap;
import java.util.Map;

public class DataStore {
    private static Map<String, MappingCopyEntity> mappingMap = new HashMap<>();

    public DataStore() {
    }

    public Map<String, MappingCopyEntity> getMappingMap() {
        return mappingMap;
    }

}
