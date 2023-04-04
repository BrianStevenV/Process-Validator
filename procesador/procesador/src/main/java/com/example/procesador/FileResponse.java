package com.example.procesador;

public class FileResponse {
    private int validLines;
    private int invalidLines;

    public FileResponse(){}

    public FileResponse(int validLines, int invalidLines) {
        this.validLines = validLines;
        this.invalidLines = invalidLines;
    }

    public void setValidLines(int validLines) {
        this.validLines = validLines;
    }

    public void setInvalidLines(int invalidLines) {
        this.invalidLines = invalidLines;
    }

    public int getValidLines() {
        return validLines;
    }

    public int getInvalidLines() {
        return invalidLines;
    }
}
