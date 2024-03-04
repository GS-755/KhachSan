package com.sinhvien.khachsan.config;

public final class AppProperties {
    // Tham khảo: https://refactoring.guru/design-patterns/singleton
    private static AppProperties instance = new AppProperties();

    private AppProperties() {

    }

    public String getApiUrl() {
        return "http://192.168.10.130/api/";
    }

    public static AppProperties getInstance() {
        return AppProperties.instance;
    }
    private static void setInstance(AppProperties instance) {
        AppProperties.instance = instance;
    }
}
