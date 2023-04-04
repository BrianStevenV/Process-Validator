package com.example.procesador.Module;

import com.fasterxml.jackson.annotation.JsonProperty;

public class File {
    @JsonProperty("path")
    private String path;
    @JsonProperty("type")
    private String type;

    public File(String path, String type) {
        this.path = path;
        this.type = type;
    }
    public File(){}

    public String getPath(){
        return this.path;
    }

    public String getType() {
        return type;
    }
}
