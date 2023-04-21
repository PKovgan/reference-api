package com.p.k.referenceapi.entity;

import lombok.Data;

@Data
public class Mapping {

    private String ac;
    private MappingCopyEntity mce;

    public Mapping() {
    }

    public Mapping(String ac, MappingCopyEntity mce) {
        this.ac = ac;
        this.mce = mce;
    }
}
