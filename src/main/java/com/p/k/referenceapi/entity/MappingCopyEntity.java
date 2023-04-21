package com.p.k.referenceapi.entity;

import lombok.Data;

@Data
public class MappingCopyEntity {
    private String ABCCopy;
    private String entity;

    public MappingCopyEntity() {
    }

    public MappingCopyEntity(String ABCCopy, String entity) {
        this.ABCCopy = ABCCopy;
        this.entity = entity;
    }
}
