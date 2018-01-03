package com.orders.enumaration;

import java.util.Arrays;

public enum OrderStatus implements TypeEnum<String> {
    WAITING("beklemede"), PREPERING("hazırlanıyor"), PREPERED("hazırlandı"), CANCEL("iptal");

    OrderStatus(String code) {
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public static OrderStatus getEnumByCode(String code) {
        return Arrays.stream(OrderStatus.values()).filter(x -> x.getCode().equalsIgnoreCase(code)).findAny().orElse(null);
    }
}
