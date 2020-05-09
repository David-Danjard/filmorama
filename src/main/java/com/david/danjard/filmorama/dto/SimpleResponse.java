package com.david.danjard.filmorama.dto;

public class SimpleResponse {

    private String data;

    public SimpleResponse(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
