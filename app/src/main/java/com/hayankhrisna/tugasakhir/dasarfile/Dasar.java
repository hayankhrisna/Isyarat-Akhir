package com.hayankhrisna.tugasakhir.dasarfile;

public class Dasar {
    private String Title;
    private int Thumbnail;

    public Dasar(){
    }

    public Dasar(String title, int thumbnail){
        Title = title;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
