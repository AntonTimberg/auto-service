package com.company.autoservice.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum OrderStatus implements EnumClass<Integer> {

    NOT_STARTED(10),
    IN_PROGRESS(20),
    COMPLETE(30);

    private final Integer id;

    OrderStatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static OrderStatus fromId(Integer id) {
        for (OrderStatus at : OrderStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}