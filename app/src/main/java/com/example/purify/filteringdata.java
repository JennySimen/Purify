package com.example.purify;

public class filteringdata {
    private int image;
    private String process;

    public filteringdata(int image, String process) {
        this.image = image;
        this.process = process;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }
}
